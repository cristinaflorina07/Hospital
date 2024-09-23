package com.exemple.Hospital.serviceapi;

import com.exemple.Hospital.entity.PersonalPatientData;
import com.exemple.Hospital.repository.AppointmentRepository;
import com.exemple.Hospital.repository.PersonalPatientDataRepository;

import java.util.List;
import java.util.Optional;

public interface PersonalPatientDataServiceapi {
    List<PersonalPatientData> getAllPersonalPatientData();
    PersonalPatientData addPersonalPatientData(PersonalPatientData personalPatientData);
    Optional<PersonalPatientData> getPersonalPatientDataById(Long id);


}
