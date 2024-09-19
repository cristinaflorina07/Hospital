package com.example.hospital.service;

import com.example.hospital.entity.PersonalPatientData;
import com.example.hospital.repository.PersonalPatientDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonalPatientDataService {
    private final PersonalPatientDataRepository personalPatientDataRepository;

    public PersonalPatientDataService(PersonalPatientDataRepository personalPatientDataRepository) {
        this.personalPatientDataRepository = personalPatientDataRepository;
    }
public List<PersonalPatientDataRepository> getPersonalPatientData(){
        return personalPatientDataRepository.findAll();
}
//public PersonalPatientData addPersonalPatientData(PersonalPatientData personalPatientData){
//        return personalPatientDataRepository.save(personalPatientData);
//}
}
