package com.example.hospital.serviceImpl;

import com.example.hospital.entity.MedicalInformation;
import com.example.hospital.repository.MedicalInformationRepository;
import com.example.hospital.serviceAPI.MedicalInformationServiceAPI;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalInformationServiceImpl implements MedicalInformationServiceAPI {
    private final MedicalInformationRepository medicalInformationRepository;

    public MedicalInformationServiceImpl(MedicalInformationRepository medicalInformationRepository) {
        this.medicalInformationRepository = medicalInformationRepository;
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
