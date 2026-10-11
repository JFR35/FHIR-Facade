package com.fhirFacade.domain.model;

public record Episodio(
        String id,
        String tipo,
        String fechaInicio,
        String fechaFin,
        String centroCod,
        String centroDescr,
        String estado,
        Profesional profesional
) {
}
