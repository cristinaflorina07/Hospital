package com.exemple.hospital.repository;

import com.exemple.hospital.entity.PersonalPatientData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalPatientDataRepository extends JpaRepository<PersonalPatientData, Long> {
}
