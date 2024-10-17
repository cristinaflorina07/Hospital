package com.example.hospital.serviceAPI;

import com.example.hospital.entity.MedicalInformation;


import java.util.List;
import java.util.Optional;

public interface MedicalInformationServiceAPI {
    List<MedicalInformation> getAllMedicalInformation();
    MedicalInformation addMedicalInformation(MedicalInformation medicalInformation);
    Optional<MedicalInformation>  getMedicalInformationById(Long id);
}
