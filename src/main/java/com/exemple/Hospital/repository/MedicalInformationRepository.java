package com.exemple.Hospital.repository;

import com.exemple.Hospital.entity.MedicalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalInformationRepository extends JpaRepository<MedicalInformation,Long> {
}
