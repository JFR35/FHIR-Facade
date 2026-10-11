package com.fhirFacade.domain.model;

// episodio puede ser null: el LEFT JOIN en Mirth no siempre encuentra encuentro asociado
public record Inmunizacion(
        Paciente paciente,
        Vacuna vacuna,
        Episodio episodio
) {
}