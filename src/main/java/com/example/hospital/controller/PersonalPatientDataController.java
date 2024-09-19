package com.example.hospital.controller;

import com.example.hospital.repository.PersonalPatientDataRepository;
import com.example.hospital.service.PersonalPatientDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/PersonalPatientData")
public class PersonalPatientDataController {
    private final PersonalPatientDataService personalPatientDataService;

    public PersonalPatientDataController(PersonalPatientDataService personalPatientDataService) {
        this.personalPatientDataService = personalPatientDataService;
    }
    @GetMapping("/getPersonalPatientData")
    public List<PersonalPatientDataRepository> getPersonalPatientData(){
        return personalPatientDataService.getPersonalPatientData();
    }
}
