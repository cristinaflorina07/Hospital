package com.exemple.Hospital.controller;

import com.exemple.Hospital.entity.MedicalInformation;
import com.exemple.Hospital.serviceimpl.MedicalInformationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Appointment")
public class MedicalInformationController {
    public final MedicalInformationService medicalInformationService;

    public MedicalInformationController(MedicalInformationService medicalInformationService) {
        this.medicalInformationService = medicalInformationService;
    }
    @PostMapping("/addMedicalInformation")
    public MedicalInformation addMedicalInformation(@RequestBody MedicalInformation medicalInformation){
        return medicalInformationService.addMedicalInformation(medicalInformation);
    }
}
