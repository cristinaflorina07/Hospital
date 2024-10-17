package com.example.hospital.repository;

import com.example.hospital.entity.MedicalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalInformationRepository extends JpaRepository<MedicalInformation,Long> {
}
