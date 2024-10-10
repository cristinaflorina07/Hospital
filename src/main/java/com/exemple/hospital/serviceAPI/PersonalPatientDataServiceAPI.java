package com.exemple.hospital.serviceAPI;

import com.exemple.hospital.entity.PersonalPatientData;

import java.util.List;
import java.util.Optional;

public interface PersonalPatientDataServiceAPI {
    List<PersonalPatientData> getAllPersonalPatientData();
    PersonalPatientData addPersonalPatientData(PersonalPatientData personalPatientData);
    Optional<PersonalPatientData> getPersonalPatientDataById(Long id);



}
