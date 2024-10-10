package com.exemple.hospital.controller;

import com.exemple.hospital.entity.Doctor;
import com.exemple.hospital.serviceAPI.DoctorServiceAPI;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")

public class DoctorController {
    private final DoctorServiceAPI doctorServiceAPI;

    public DoctorController(DoctorServiceAPI doctorServiceAPI) {
        this.doctorServiceAPI = doctorServiceAPI;
    }

    @PostMapping("/addDoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctorServiceAPI.addDoctor(doctor);
    }
}
