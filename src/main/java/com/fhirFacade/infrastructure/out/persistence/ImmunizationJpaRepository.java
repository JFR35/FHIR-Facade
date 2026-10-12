package com.fhirFacade.infra.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImmunizationJpaRepository extends JpaRepository<ImmunizationEntity, Long> {
}
