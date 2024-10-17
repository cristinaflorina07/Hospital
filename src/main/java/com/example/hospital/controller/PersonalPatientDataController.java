package com.example.hospital.controller;

import com.example.hospital.entity.PersonalPatientData;
import com.example.hospital.serviceAPI.PersonalPatientDataServiceAPI;
import com.example.hospital.serviceImpl.PersonalPatientDataServiceImpl;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patient")

public class PersonalPatientDataController {
    private final PersonalPatientDataServiceAPI personalPatientDataServiceAPI;

    public PersonalPatientDataController(PersonalPatientDataServiceImpl personalPatientDataServiceimpl) {
        this.personalPatientDataServiceAPI = personalPatientDataServiceimpl;
    }

    @GetMapping("/getAllPatient")
    public List<PersonalPatientData> getAllPersonalPatientData() {
        return personalPatientDataServiceAPI.getAllPersonalPatientData();
    }

    @PostMapping("/AddPersonalPatientData")
    public PersonalPatientData addPersonalPatientData(@Valid @RequestBody PersonalPatientData personalPatientData) {
        return personalPatientDataServiceAPI.addPersonalPatientData(personalPatientData);

    }
    @GetMapping("/findById/{id}")
    public Optional<PersonalPatientData> getPersonalPatientDataById(@PathVariable Long id){
        return personalPatientDataServiceAPI.getPersonalPatientDataById(id);
    }

}
