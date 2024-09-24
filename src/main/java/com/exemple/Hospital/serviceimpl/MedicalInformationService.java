package com.exemple.Hospital.serviceimpl;

import com.exemple.Hospital.entity.MedicalInformation;
import com.exemple.Hospital.repository.MedicalInformationRepository;
import com.exemple.Hospital.serviceapi.MedicalInformationServiceapi;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalInformationService implements MedicalInformationServiceapi {
    private final MedicalInformationRepository medicalInformationRepository;

    public MedicalInformationService(MedicalInformationRepository medicalInformationRepository) {
        this.medicalInformationRepository = medicalInformationRepository;
    }
    public List<MedicalInformation> getMedicalInformation(){
        return medicalInformationRepository.findAll();
    }


    public List<MedicalInformation> getAllMedicalInformation() {
        return medicalInformationRepository.findAll();
    }

    public MedicalInformation addMedicalInformation(MedicalInformation medicalInformation){
        return medicalInformationRepository.save(medicalInformation);
    }


    public Optional<MedicalInformation> getMedicalInformationById(Long id) {
        return medicalInformationRepository.findById(id);
    }
}
