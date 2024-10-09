package com.exemple.hospital.repository;

import com.exemple.hospital.entity.MedicalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalInformationRepository extends JpaRepository<MedicalInformation,Long> {
}
