package com.example.hospital.controller;

import com.example.hospital.entity.MedicalInformation;
import com.example.hospital.serviceAPI.MedicalInformationServiceAPI;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/MedicalInformation")
public class MedicalInformationController {
    public final MedicalInformationServiceAPI medicalInformationServiceAPI;

    public MedicalInformationController(MedicalInformationServiceAPI medicalInformationServiceAPI) {
        this.medicalInformationServiceAPI = medicalInformationServiceAPI;
    }

    @PostMapping("/addMedicalInformation")
    public MedicalInformation addMedicalInformation(@RequestBody MedicalInformation medicalInformation){
        return medicalInformationServiceAPI.addMedicalInformation(medicalInformation);
    }
    @GetMapping("/getMedicalInformation")
    public List<MedicalInformation> getAllApoinment(){
        return medicalInformationServiceAPI.getAllMedicalInformation();
    }
    @GetMapping("/findById/{id}")
    public Optional<MedicalInformation> getMedicalInformationById(@PathVariable Long id){
        return medicalInformationServiceAPI.getMedicalInformationById(id);
    }

}
