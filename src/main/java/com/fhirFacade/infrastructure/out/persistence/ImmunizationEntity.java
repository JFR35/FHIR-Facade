package com.fhirFacade.infra.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "immunizations")
public class ImmunizationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientIdentifier;
    private String patientGivenName;
    private String patientFirstSurname;
    private String patientSecondSurname;
    private String patientBirthDate;
    private String patientGender;

    private String vaccinationCode;
    private String vaccinationDescription;
    private String vaccinationDoseNumber;
    private String vaccinationLotNumber;
    private String vaccinationRoute;
    private String vaccinationSite;
    private String vaccinationAdministrationDate;
    private String vaccinationStatus;
    private String vaccinationPractitionerId;
    private String vaccinationPractitionerName;

    private String encounterId;
    private String encounterType;
    private String encounterStartDate;
    private String encounterEndDate;
    private String encounterFacilityCode;
    private String encounterFacilityName;
    private String encounterStatus;
    private String encounterPractitionerId;
    private String encounterPractitionerName;

    private Instant receivedAt;

    public ImmunizationEntity() {
        // required by JPA
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientIdentifier() {
        return patientIdentifier;
    }

    public void setPatientIdentifier(String patientIdentifier) {
        this.patientIdentifier = patientIdentifier;
    }

    public String getPatientGivenName() {
        return patientGivenName;
    }

    public void setPatientGivenName(String patientGivenName) {
        this.patientGivenName = patientGivenName;
    }

    public String getPatientFirstSurname() {
        return patientFirstSurname;
    }

    public void setPatientFirstSurname(String patientFirstSurname) {
        this.patientFirstSurname = patientFirstSurname;
    }

    public String getPatientSecondSurname() {
        return patientSecondSurname;
    }

    public void setPatientSecondSurname(String patientSecondSurname) {
        this.patientSecondSurname = patientSecondSurname;
    }

    public String getPatientBirthDate() {
        return patientBirthDate;
    }

    public void setPatientBirthDate(String patientBirthDate) {
        this.patientBirthDate = patientBirthDate;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getVaccinationCode() {
        return vaccinationCode;
    }

    public void setVaccinationCode(String vaccinationCode) {
        this.vaccinationCode = vaccinationCode;
    }

    public String getVaccinationDescription() {
        return vaccinationDescription;
    }

    public void setVaccinationDescription(String vaccinationDescription) {
        this.vaccinationDescription = vaccinationDescription;
    }

    public String getVaccinationDoseNumber() {
        return vaccinationDoseNumber;
    }

    public void setVaccinationDoseNumber(String vaccinationDoseNumber) {
        this.vaccinationDoseNumber = vaccinationDoseNumber;
    }

    public String getVaccinationLotNumber() {
        return vaccinationLotNumber;
    }

    public void setVaccinationLotNumber(String vaccinationLotNumber) {
        this.vaccinationLotNumber = vaccinationLotNumber;
    }

    public String getVaccinationRoute() {
        return vaccinationRoute;
    }

    public void setVaccinationRoute(String vaccinationRoute) {
        this.vaccinationRoute = vaccinationRoute;
    }

    public String getVaccinationSite() {
        return vaccinationSite;
    }

    public void setVaccinationSite(String vaccinationSite) {
        this.vaccinationSite = vaccinationSite;
    }

    public String getVaccinationAdministrationDate() {
        return vaccinationAdministrationDate;
    }

    public void setVaccinationAdministrationDate(String vaccinationAdministrationDate) {
        this.vaccinationAdministrationDate = vaccinationAdministrationDate;
    }

    public String getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(String vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    public String getVaccinationPractitionerId() {
        return vaccinationPractitionerId;
    }

    public void setVaccinationPractitionerId(String vaccinationPractitionerId) {
        this.vaccinationPractitionerId = vaccinationPractitionerId;
    }

    public String getVaccinationPractitionerName() {
        return vaccinationPractitionerName;
    }

    public void setVaccinationPractitionerName(String vaccinationPractitionerName) {
        this.vaccinationPractitionerName = vaccinationPractitionerName;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getEncounterType() {
        return encounterType;
    }

    public void setEncounterType(String encounterType) {
        this.encounterType = encounterType;
    }

    public String getEncounterStartDate() {
        return encounterStartDate;
    }

    public void setEncounterStartDate(String encounterStartDate) {
        this.encounterStartDate = encounterStartDate;
    }

    public String getEncounterEndDate() {
        return encounterEndDate;
    }

    public void setEncounterEndDate(String encounterEndDate) {
        this.encounterEndDate = encounterEndDate;
    }

    public String getEncounterFacilityCode() {
        return encounterFacilityCode;
    }

    public void setEncounterFacilityCode(String encounterFacilityCode) {
        this.encounterFacilityCode = encounterFacilityCode;
    }

    public String getEncounterFacilityName() {
        return encounterFacilityName;
    }

    public void setEncounterFacilityName(String encounterFacilityName) {
        this.encounterFacilityName = encounterFacilityName;
    }

    public String getEncounterStatus() {
        return encounterStatus;
    }

    public void setEncounterStatus(String encounterStatus) {
        this.encounterStatus = encounterStatus;
    }

    public String getEncounterPractitionerId() {
        return encounterPractitionerId;
    }

    public void setEncounterPractitionerId(String encounterPractitionerId) {
        this.encounterPractitionerId = encounterPractitionerId;
    }

    public String getEncounterPractitionerName() {
        return encounterPractitionerName;
    }

    public void setEncounterPractitionerName(String encounterPractitionerName) {
        this.encounterPractitionerName = encounterPractitionerName;
    }

    public Instant getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(Instant receivedAt) {
        this.receivedAt = receivedAt;
    }
}
