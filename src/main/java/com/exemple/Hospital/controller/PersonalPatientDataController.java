package com.exemple.Hospital.controller;

import com.exemple.Hospital.entity.PersonalPatientData;
import com.exemple.Hospital.serviceapi.PersonalPatientDataServiceapi;
import com.exemple.Hospital.serviceimpl.PersonalPatientDataServiceimpl;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patient")

public class PersonalPatientDataController {
    private final PersonalPatientDataServiceapi personalPatientDataServiceapi;

    public PersonalPatientDataController(PersonalPatientDataServiceimpl personalPatientDataServiceimpl) {
        this.personalPatientDataServiceapi = personalPatientDataServiceimpl;
    }

    @GetMapping("/get")
    public List<PersonalPatientData> getAllPersonalPatientData() {
        return personalPatientDataServiceapi.getAllPersonalPatientData();
    }

    @PostMapping("/AddPersonalPatientData")
    public PersonalPatientData addPersonalPatientData(@Valid @RequestBody PersonalPatientData personalPatientData) {
        return personalPatientDataServiceapi.addPersonalPatientData(personalPatientData);

    }
    @GetMapping("/findById/{id}")
    public Optional<PersonalPatientData> getMedicalPatientDataById(@PathVariable Long id){
        return personalPatientDataServiceapi.getPersonalPatientDataById(id);
    }

}
