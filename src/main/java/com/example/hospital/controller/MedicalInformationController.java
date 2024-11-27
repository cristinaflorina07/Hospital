package com.example.hospital.controller;

import com.example.hospital.entity.MedicalInformation;
import com.example.hospital.serviceAPI.MedicalInformationServiceAPI;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medical-information")
public class MedicalInformationController {
    public final MedicalInformationServiceAPI medicalInformationServiceAPI;

    public MedicalInformationController(MedicalInformationServiceAPI medicalInformationServiceAPI) {
        this.medicalInformationServiceAPI = medicalInformationServiceAPI;
    }

    @PostMapping("/add")
    public MedicalInformation addMedicalInformation(@RequestBody MedicalInformation medicalInformation){
        return medicalInformationServiceAPI.addMedicalInformation(medicalInformation);
    }
    @GetMapping("/get")
    public List<MedicalInformation> getAllMedicalInformation(){
        return medicalInformationServiceAPI.getAllMedicalInformation();
    }
    @GetMapping("/findById/{id}")
    public Optional<MedicalInformation> getMedicalInformationById(@PathVariable Long id){
        return medicalInformationServiceAPI.getMedicalInformationById(id);
    }

}
