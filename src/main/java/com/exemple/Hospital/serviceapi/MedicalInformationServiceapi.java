package com.exemple.Hospital.serviceapi;

import com.exemple.Hospital.entity.MedicalInformation;
import com.exemple.Hospital.repository.PersonalPatientDataRepository;


import java.util.List;
import java.util.Optional;

public interface MedicalInformationServiceapi {
    List<MedicalInformation> getAllMedicalInformation();
    MedicalInformation addMedicalInformation(MedicalInformation medicalInformation);
    Optional<MedicalInformation>  getMedicalInformationById(Long id);
}
