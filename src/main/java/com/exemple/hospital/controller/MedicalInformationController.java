package com.exemple.hospital.controller;

import com.exemple.hospital.entity.MedicalInformation;
import com.exemple.hospital.serviceapi.MedicalInformationServiceAPI;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/MedicalInformation")
public class MedicalInformationController {
    public final MedicalInformationServiceAPI medicalInformationServiceapi;

    public MedicalInformationController(MedicalInformationServiceAPI medicalInformationServiceapi) {
        this.medicalInformationServiceapi = medicalInformationServiceapi;
    }

    @PostMapping("/addMedicalInformation")
    public MedicalInformation addMedicalInformation(@RequestBody MedicalInformation medicalInformation){
        return medicalInformationServiceapi.addMedicalInformation(medicalInformation);
    }
    @GetMapping("/getMedicalInformation")
    public List<MedicalInformation> getAllApoinment(){
        return medicalInformationServiceapi.getAllMedicalInformation();
    }
    @GetMapping("/findById/{id}")
    public Optional<MedicalInformation> getMedicalInformationById(@PathVariable Long id){
        return medicalInformationServiceapi.getMedicalInformationById(id);
    }

}
