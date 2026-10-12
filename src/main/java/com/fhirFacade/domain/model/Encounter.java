package com.fhirFacade.domain.model;

public record Encounter(
        String id,
        String type,
        String startDate,
        String endDate,
        String facilityCode,
        String facilityName,
        String status,
        Practitioner practitioner
) {
}