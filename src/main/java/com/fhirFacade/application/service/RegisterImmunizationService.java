package com.fhirFacade.application.service;

import com.fhirFacade.application.port.in.RegisterImmunizationUseCase;
import com.fhirFacade.application.port.out.SaveImmunizationPort;
import com.fhirFacade.domain.model.Immunization;
import org.springframework.stereotype.Service;

@Service
public class RegisterImmunizationService implements RegisterImmunizationUseCase {

    private final SaveImmunizationPort saveImmunizationPort;

    public RegisterImmunizationService(SaveImmunizationPort saveImmunizationPort) {
        this.saveImmunizationPort = saveImmunizationPort;
    }

    @Override
    public void register(Immunization immunization) {
        // This is where domain validation would go later
        // (e.g. reject if the patient identifier is missing) before persisting.
        saveImmunizationPort.save(immunization);
    }
}