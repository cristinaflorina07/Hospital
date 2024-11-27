package com.example.hospital.controller;

import com.example.hospital.entity.Doctor;
import com.example.hospital.serviceAPI.DoctorServiceAPI;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctor")

public class DoctorController {
    private final DoctorServiceAPI doctorServiceAPI;

    public DoctorController(DoctorServiceAPI doctorServiceAPI) {
        this.doctorServiceAPI = doctorServiceAPI;
    }

    @PostMapping("/add")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctorServiceAPI.addDoctor(doctor);
    }
    @GetMapping("/get")
    public List<Doctor> getAllDoctor(){
        return doctorServiceAPI.getAllDoctor();
    }
    @GetMapping("/findById/{id}")
    Optional<Doctor> findDoctorById(@PathVariable Long id){
        return doctorServiceAPI.findDoctorById(id);
    }
}
