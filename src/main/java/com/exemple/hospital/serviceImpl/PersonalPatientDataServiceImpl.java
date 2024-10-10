package com.exemple.hospital.serviceImpl;

import com.exemple.hospital.entity.PersonalPatientData;
import com.exemple.hospital.repository.PersonalPatientDataRepository;
import com.exemple.hospital.serviceAPI.PersonalPatientDataServiceAPI;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PersonalPatientDataServiceImpl implements PersonalPatientDataServiceAPI {
    private final PersonalPatientDataRepository personalPatientDataRepository;

    public PersonalPatientDataServiceImpl(PersonalPatientDataRepository personalPatientDataRepository) {
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




