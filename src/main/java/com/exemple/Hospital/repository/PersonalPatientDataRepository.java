package com.exemple.Hospital.repository;

import com.exemple.Hospital.entity.PersonalPatientData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalPatientDataRepository extends JpaRepository<PersonalPatientData, Long> {
}
