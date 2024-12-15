package com.example.hospital.controller;

import com.example.hospital.entity.Appointment;
import com.example.hospital.serviceAPI.AppointmentServiceAPI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    private final AppointmentServiceAPI appointmentServiceapi;

    public AppointmentController(AppointmentServiceAPI appointmentServiceapi) {
        this.appointmentServiceapi = appointmentServiceapi;
    }

    @PostMapping("/add")
    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) {
        return ResponseEntity.ok(appointmentServiceapi.createAppointment(appointment));
    }



    @GetMapping("/get")
    public List<Appointment> getAllAppointment() {
        return appointmentServiceapi.getAllAppointment();
    }
}
