package com.fhirFacade.application.port.out;

import com.fhirFacade.domain.model.Immunization;

public interface SaveImmunizationPort {
    void save(Immunization immunization);
}