package com.fhirFacade.infra.in.rest.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PractitionerXmlDto {

    @JacksonXmlProperty(localName = "Id")
    private String id;

    @JacksonXmlProperty(localName = "Nombre")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
