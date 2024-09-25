package com.exemple.Hospital.controller;

import com.exemple.Hospital.entity.MedicalInformation;
import com.exemple.Hospital.serviceapi.MedicalInformationServiceapi;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/MedicalInformation")
public class MedicalInformationController {
    public final MedicalInformationServiceapi medicalInformationServiceapi;

    public MedicalInformationController(MedicalInformationServiceapi medicalInformationServiceapi) {
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
    public Optional<MedicalInformation> getMedivalInformationById(@PathVariable Long id){
        return medicalInformationServiceapi.getMedicalInformationById(id);
    }

}
