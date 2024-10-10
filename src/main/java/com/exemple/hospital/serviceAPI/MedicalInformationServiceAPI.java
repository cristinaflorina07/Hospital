package com.exemple.hospital.serviceAPI;

import com.exemple.hospital.entity.MedicalInformation;


import java.util.List;
import java.util.Optional;

public interface MedicalInformationServiceAPI {
    List<MedicalInformation> getAllMedicalInformation();
    MedicalInformation addMedicalInformation(MedicalInformation medicalInformation);
    Optional<MedicalInformation>  getMedicalInformationById(Long id);
}
