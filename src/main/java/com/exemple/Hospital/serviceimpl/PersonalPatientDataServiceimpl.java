package com.exemple.Hospital.serviceimpl;

import com.exemple.Hospital.entity.PersonalPatientData;
import com.exemple.Hospital.repository.PersonalPatientDataRepository;
import com.exemple.Hospital.serviceapi.PersonalPatientDataServiceapi;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PersonalPatientDataServiceimpl implements PersonalPatientDataServiceapi {
    private final PersonalPatientDataRepository personalPatientDataRepository;

    public PersonalPatientDataServiceimpl(PersonalPatientDataRepository personalPatientDataRepository) {
        this.personalPatientDataRepository = personalPatientDataRepository;
    }


    public List<PersonalPatientData> getAllPersonalPatientData() {
        return personalPatientDataRepository.findAll();
    }


    public PersonalPatientData addPersonalPatientData(PersonalPatientData personalPatientData) {
        return personalPatientDataRepository.save(personalPatientData);
    }


    public Optional<PersonalPatientData> getPersonalPatientDataById(Long id) {

        return personalPatientDataRepository.findById(id);
    }
}




