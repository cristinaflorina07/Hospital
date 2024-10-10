package com.exemple.hospital.controller;

import com.exemple.hospital.entity.PersonalPatientData;
import com.exemple.hospital.serviceAPI.PersonalPatientDataServiceAPI;
import com.exemple.hospital.serviceImpl.PersonalPatientDataServiceImpl;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patient")

public class PersonalPatientDataController {
    private final PersonalPatientDataServiceAPI personalPatientDataServiceapi;

    public PersonalPatientDataController(PersonalPatientDataServiceImpl personalPatientDataServiceimpl) {
        this.personalPatientDataServiceapi = personalPatientDataServiceimpl;
    }

    @GetMapping("/getAllPatient")
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
