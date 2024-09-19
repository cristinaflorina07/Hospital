package com.example.hospital.repository;

import com.example.hospital.entity.MadicalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalInformationRepository extends JpaRepository<MadicalInformation, Long> {

}
