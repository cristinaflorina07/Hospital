package com.exemple.Hospital.controller;

import com.exemple.Hospital.entity.PersonalPatientData;
import com.exemple.Hospital.service.PersonalPatientDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PersonalPatientDataController {
    private final PersonalPatientDataService personalPatientDataService;

    public PersonalPatientDataController(PersonalPatientDataService personalPatientDataService) {
        this.personalPatientDataService = personalPatientDataService;
    }
    @GetMapping("/get")
    public List<PersonalPatientData> getPersonalPatientData(){
        return personalPatientDataService.getPersonalPatientData();
    }
}
