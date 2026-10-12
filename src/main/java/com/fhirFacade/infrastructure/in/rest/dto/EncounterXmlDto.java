package com.fhirFacade.infra.in.rest.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class EncounterXmlDto {

    @JacksonXmlProperty(localName = "Id")
    private String id;

    @JacksonXmlProperty(localName = "Tipo")
    private String type;

    @JacksonXmlProperty(localName = "FechaInicio")
    private String startDate;

    @JacksonXmlProperty(localName = "FechaFin")
    private String endDate;

    @JacksonXmlProperty(localName = "CentroCod")
    private String facilityCode;

    @JacksonXmlProperty(localName = "CentroDescr")
    private String facilityName;

    @JacksonXmlProperty(localName = "Estado")
    private String status;

    @JacksonXmlProperty(localName = "Profesional")
    private PractitionerXmlDto practitioner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
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
