package com.exemple.Hospital.service;

import com.exemple.Hospital.entity.MedicalInformation;
import com.exemple.Hospital.repository.MedicalInformationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalInformationService {
    private final MedicalInformationRepository medicalInformationRepository;

    public MedicalInformationService(MedicalInformationRepository medicalInformationRepository) {
        this.medicalInformationRepository = medicalInformationRepository;
    }
    public List<MedicalInformation> getMedicalInformation(){
        return medicalInformationRepository.findAll();
    }
}
