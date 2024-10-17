package com.example.hospital.controller;

import com.example.hospital.entity.Appointment;
import com.example.hospital.serviceAPI.AppointmentServiceAPI;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    private final AppointmentServiceAPI appointmentServiceapi;

    public AppointmentController(AppointmentServiceAPI appointmentServiceapi) {
        this.appointmentServiceapi = appointmentServiceapi;
    }

    @PostMapping("/addAppointment")
    @ResponseStatus(HttpStatus.CREATED)
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        return appointmentServiceapi.addAppointment(appointment);
    }
    @GetMapping("/getAppointment")
    public List<Appointment> getAllAppointment(){
        return appointmentServiceapi.getAllAppointment();
    }
}
