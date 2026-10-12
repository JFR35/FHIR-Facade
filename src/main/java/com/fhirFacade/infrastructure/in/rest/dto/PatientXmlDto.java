package com.fhirFacade.infra.in.rest.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PatientXmlDto {

    @JacksonXmlProperty(localName = "Identificador")
    private String identifier;

    @JacksonXmlProperty(localName = "Nombre")
    private String givenName;

    @JacksonXmlProperty(localName = "Apellido1")
    private String firstSurname;

    @JacksonXmlProperty(localName = "Apellido2")
    private String secondSurname;

    @JacksonXmlProperty(localName = "FechaNacimiento")
    private String birthDate;

    @JacksonXmlProperty(localName = "Sexo")
    private String gender;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
