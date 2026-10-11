package com.fhirFacade.domain.model;

public record Vacuna(
        String codigo,
        String descripcion,
        String dosisNumero,
        String lote,
        String viaAdmin,
        String lugarAdmin,
        String fechaAdmin,
        String estado,
        Profesional profesional
) {
}
