package com.fhirFacade.infra.in.rest;

import com.fhirFacade.application.port.in.RegisterImmunizationUseCase;
import com.fhirFacade.domain.model.Immunization;
import com.fhirFacade.infra.in.rest.dto.ImmunizationXmlDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Inbound/driving adapter that receives the proprietary XML sent by Mirth (HTTP Sender)
// after reading and transforming vacunacion_pendiente.
@RestController
@RequestMapping("/internal/ingest")
public class ImmunizationIngestController {

    private static final Logger log = LoggerFactory.getLogger(ImmunizationIngestController.class);

    private final RegisterImmunizationUseCase registerImmunizationUseCase;
    private final ImmunizationXmlMapper mapper;

    public ImmunizationIngestController(RegisterImmunizationUseCase registerImmunizationUseCase,
                                         ImmunizationXmlMapper mapper) {
        this.registerImmunizationUseCase = registerImmunizationUseCase;
        this.mapper = mapper;
    }

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Void> receive(@RequestBody ImmunizationXmlDto xmlDto) {
        log.info("Received immunization for patient identifier={}",
                xmlDto.getPatient() != null ? xmlDto.getPatient().getIdentifier() : "unknown");

        Immunization immunization = mapper.map(xmlDto);
        registerImmunizationUseCase.register(immunization);

        return ResponseEntity.ok().build();
    }
}
