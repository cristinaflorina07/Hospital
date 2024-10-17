package com.example.hospital.serviceAPI;

import com.example.hospital.entity.PersonalPatientData;

import java.util.List;
import java.util.Optional;

public interface PersonalPatientDataServiceAPI {
    List<PersonalPatientData> getAllPersonalPatientData();
    PersonalPatientData addPersonalPatientData(PersonalPatientData personalPatientData);
    Optional<PersonalPatientData> getPersonalPatientDataById(Long id);



}
