package com.fhirFacade.infra.in.rest.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Inmunizacion")
public class ImmunizationXmlDto {

    @JacksonXmlProperty(localName = "Paciente")
    private PatientXmlDto patient;

    @JacksonXmlProperty(localName = "Vacuna")
    private VaccinationXmlDto vaccination;

    // May be absent: Mirth's JS does "delete tmp.Episodio" when the LEFT JOIN finds no match
    @JacksonXmlProperty(localName = "Episodio")
    private EncounterXmlDto encounter;

    public PatientXmlDto getPatient() {
        return patient;
    }

    public void setPatient(PatientXmlDto patient) {
        this.patient = patient;
    }

    public VaccinationXmlDto getVaccination() {
        return vaccination;
    }

    public void setVaccination(VaccinationXmlDto vaccination) {
        this.vaccination = vaccination;
    }

    public EncounterXmlDto getEncounter() {
        return encounter;
    }

    public void setEncounter(EncounterXmlDto encounter) {
        this.encounter = encounter;
    }
}
