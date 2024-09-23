package com.exemple.Hospital.controller;

import com.exemple.Hospital.entity.PersonalPatientData;
import com.exemple.Hospital.serviceimpl.PersonalPatientDataServiceimpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PersonalPatientDataController {
    private final PersonalPatientDataServiceimpl personalPatientDataServiceimpl;

    public PersonalPatientDataController(PersonalPatientDataServiceimpl personalPatientDataServiceimpl) {
        this.personalPatientDataServiceimpl = personalPatientDataServiceimpl;
    }

    @GetMapping("/get")
    public List<PersonalPatientData> getPersonalPatientData(){
        return personalPatientDataServiceimpl.getPersonalPatientData();
    }
}
