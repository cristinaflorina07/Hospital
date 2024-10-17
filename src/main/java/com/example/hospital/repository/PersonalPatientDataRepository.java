package com.example.hospital.repository;

import com.example.hospital.entity.PersonalPatientData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalPatientDataRepository extends JpaRepository<PersonalPatientData, Long> {
}
