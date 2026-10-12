package com.fhirFacade.domain.model;

// encounter can be null: the LEFT JOIN in Mirth doesn't always find an associated encounter
public record Immunization(
        Patient patient,
        Vaccination vaccination,
        Encounter encounter
) {
}