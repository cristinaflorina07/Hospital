package com.exemple.Hospital.service;

import com.exemple.Hospital.entity.PersonalPatientData;
import com.exemple.Hospital.repository.PersonalPatientDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PersonalPatientDataService {
    private final PersonalPatientDataRepository personalPatientDataRepository;

    public PersonalPatientDataService(PersonalPatientDataRepository personalPatientDataRepository) {
        this.personalPatientDataRepository = personalPatientDataRepository;
    }

    public List<PersonalPatientData> getPersonalPatientData() {
        return personalPatientDataRepository.findAll();
    }
}




