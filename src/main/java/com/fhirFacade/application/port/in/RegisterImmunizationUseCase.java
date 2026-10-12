package com.fhirFacade.application.port.in;

import com.fhirFacade.domain.model.Immunization;

public interface RegisterImmunizationUseCase {
    void register(Immunization immunization);
}
