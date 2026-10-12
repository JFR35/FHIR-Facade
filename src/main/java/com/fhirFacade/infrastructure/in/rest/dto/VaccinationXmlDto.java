package com.fhirFacade.infra.in.rest.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class VaccinationXmlDto {

    @JacksonXmlProperty(localName = "Codigo")
    private String code;

    @JacksonXmlProperty(localName = "Descripcion")
    private String description;

    @JacksonXmlProperty(localName = "DosisNumero")
    private String doseNumber;

    @JacksonXmlProperty(localName = "Lote")
    private String lotNumber;

    @JacksonXmlProperty(localName = "ViaAdmin")
    private String route;

    @JacksonXmlProperty(localName = "LugarAdmin")
    private String site;

    @JacksonXmlProperty(localName = "FechaAdmin")
    private String administrationDate;

    @JacksonXmlProperty(localName = "Estado")
    private String status;

    @JacksonXmlProperty(localName = "Profesional")
    private PractitionerXmlDto practitioner;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDoseNumber() {
        return doseNumber;
    }

    public void setDoseNumber(String doseNumber) {
        this.doseNumber = doseNumber;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getAdministrationDate() {
        return administrationDate;
    }

    public void setAdministrationDate(String administrationDate) {
        this.administrationDate = administrationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PractitionerXmlDto getPractitioner() {
        return practitioner;
    }

    public void setPractitioner(PractitionerXmlDto practitioner) {
        this.practitioner = practitioner;
    }
}
