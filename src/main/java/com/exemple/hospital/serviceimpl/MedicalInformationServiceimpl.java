package com.exemple.hospital.serviceimpl;

import com.exemple.hospital.entity.MedicalInformation;
import com.exemple.hospital.repository.MedicalInformationRepository;
import com.exemple.hospital.serviceapi.MedicalInformationServiceAPI;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalInformationServiceimpl implements MedicalInformationServiceAPI {
    private final MedicalInformationRepository medicalInformationRepository;

    public MedicalInformationServiceimpl(MedicalInformationRepository medicalInformationRepository) {
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
