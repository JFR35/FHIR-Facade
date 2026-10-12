package com.fhirFacade.domain.model;

public record Vaccination(
        String code,
        String description,
        String doseNumber,
        String lotNumber,
        String route,
        String site,
        String administrationDate,
        String status,
        Practitioner practitioner
) {
}