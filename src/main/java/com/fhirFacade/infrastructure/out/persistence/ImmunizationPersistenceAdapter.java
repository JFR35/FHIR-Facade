package com.fhirFacade.infra.out.persistence;

import com.fhirFacade.application.port.out.SaveImmunizationPort;
import com.fhirFacade.domain.model.Encounter;
import com.fhirFacade.domain.model.Immunization;
import com.fhirFacade.domain.model.Patient;
import com.fhirFacade.domain.model.Practitioner;
import com.fhirFacade.domain.model.Vaccination;
import org.springframework.stereotype.Component;

import java.time.Instant;

// Outbound/driven adapter: persists the domain model as a flattened JPA entity.
@Component
public class ImmunizationPersistenceAdapter implements SaveImmunizationPort {

    private final ImmunizationJpaRepository repository;

    public ImmunizationPersistenceAdapter(ImmunizationJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Immunization immunization) {
        ImmunizationEntity entity = new ImmunizationEntity();

        Patient patient = immunization.patient();
        if (patient != null) {
            entity.setPatientIdentifier(patient.identifier());
            entity.setPatientGivenName(patient.givenName());
            entity.setPatientFirstSurname(patient.firstSurname());
            entity.setPatientSecondSurname(patient.secondSurname());
            entity.setPatientBirthDate(patient.birthDate());
            entity.setPatientGender(patient.gender());
        }

        Vaccination vaccination = immunization.vaccination();
        if (vaccination != null) {
            entity.setVaccinationCode(vaccination.code());
            entity.setVaccinationDescription(vaccination.description());
            entity.setVaccinationDoseNumber(vaccination.doseNumber());
            entity.setVaccinationLotNumber(vaccination.lotNumber());
            entity.setVaccinationRoute(vaccination.route());
            entity.setVaccinationSite(vaccination.site());
            entity.setVaccinationAdministrationDate(vaccination.administrationDate());
            entity.setVaccinationStatus(vaccination.status());

            Practitioner vaccinationPractitioner = vaccination.practitioner();
            if (vaccinationPractitioner != null) {
                entity.setVaccinationPractitionerId(vaccinationPractitioner.id());
                entity.setVaccinationPractitionerName(vaccinationPractitioner.name());
            }
        }

        // encounter is optional: may be null when Mirth's LEFT JOIN found no match
        Encounter encounter = immunization.encounter();
        if (encounter != null) {
            entity.setEncounterId(encounter.id());
            entity.setEncounterType(encounter.type());
            entity.setEncounterStartDate(encounter.startDate());
            entity.setEncounterEndDate(encounter.endDate());
            entity.setEncounterFacilityCode(encounter.facilityCode());
            entity.setEncounterFacilityName(encounter.facilityName());
            entity.setEncounterStatus(encounter.status());

            Practitioner encounterPractitioner = encounter.practitioner();
            if (encounterPractitioner != null) {
                entity.setEncounterPractitionerId(encounterPractitioner.id());
                entity.setEncounterPractitionerName(encounterPractitioner.name());
            }
        }

        entity.setReceivedAt(Instant.now());

        repository.save(entity);
    }
}
