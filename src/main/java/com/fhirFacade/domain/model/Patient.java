package com.fhirFacade.domain.model;

public record Patient(
        String identifier,
        String givenName,
        String firstSurname,
        String secondSurname,
        String birthDate,
        String gender
) {
}