package com.example.hospital.service;

import com.example.hospital.entity.MadicalInformation;
import com.example.hospital.repository.MedicalInformationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicalInformationService {
private final MedicalInformationRepository medicalInformationRepository;

    public MedicalInformationService(MedicalInformationRepository medicalInformationRepository) {
        this.medicalInformationRepository = medicalInformationRepository;
    }
    public List<MadicalInformation> getMedicalInformation(){
        return medicalInformationRepository.findAll();
    }
}

