package com.fhirFacade.infra.in.rest;

import com.fhirFacade.domain.model.Encounter;
import com.fhirFacade.domain.model.Immunization;
import com.fhirFacade.domain.model.Patient;
import com.fhirFacade.domain.model.Practitioner;
import com.fhirFacade.domain.model.Vaccination;
import com.fhirFacade.infra.in.rest.dto.EncounterXmlDto;
import com.fhirFacade.infra.in.rest.dto.ImmunizationXmlDto;
import com.fhirFacade.infra.in.rest.dto.PatientXmlDto;
import com.fhirFacade.infra.in.rest.dto.PractitionerXmlDto;
import com.fhirFacade.infra.in.rest.dto.VaccinationXmlDto;
import org.springframework.stereotype.Component;

@Component
public class ImmunizationXmlMapper {

    public Immunization map(ImmunizationXmlDto dto) {
        return new Immunization(
                mapPatient(dto.getPatient()),
                mapVaccination(dto.getVaccination()),
                mapEncounter(dto.getEncounter())
        );
    }

    private Patient mapPatient(PatientXmlDto dto) {
        if (dto == null) {
            return null;
        }
        return new Patient(
                dto.getIdentifier(),
                dto.getGivenName(),
                dto.getFirstSurname(),
                dto.getSecondSurname(),
                dto.getBirthDate(),
                dto.getGender()
        );
    }

    private Vaccination mapVaccination(VaccinationXmlDto dto) {
        if (dto == null) {
            return null;
        }
        return new Vaccination(
                dto.getCode(),
                dto.getDescription(),
                dto.getDoseNumber(),
                dto.getLotNumber(),
                dto.getRoute(),
                dto.getSite(),
                dto.getAdministrationDate(),
                dto.getStatus(),
                mapPractitioner(dto.getPractitioner())
        );
    }

    // encounter is optional: may be absent from the XML if Mirth found no matching encounter
    private Encounter mapEncounter(EncounterXmlDto dto) {
        if (dto == null) {
            return null;
        }
        return new Encounter(
                dto.getId(),
                dto.getType(),
                dto.getStartDate(),
                dto.getEndDate(),
                dto.getFacilityCode(),
                dto.getFacilityName(),
                dto.getStatus(),
                mapPractitioner(dto.getPractitioner())
        );
    }

    private Practitioner mapPractitioner(PractitionerXmlDto dto) {
        if (dto == null) {
            return null;
        }
        return new Practitioner(dto.getId(), dto.getName());
    }
}
