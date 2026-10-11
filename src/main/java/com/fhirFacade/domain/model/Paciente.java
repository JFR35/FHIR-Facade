package com.fhirFacade.domain.model;

public record Paciente(
        String identificador,
        String nombre,
        String apellido1,
        String apellido2,
        String fechaNacimiento,
        String sexo
) {
}