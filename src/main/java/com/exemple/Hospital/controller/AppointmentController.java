package com.exemple.Hospital.controller;

import com.exemple.Hospital.entity.Appointment;
import com.exemple.Hospital.serviceimpl.AppointmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Appointment")
public class AppointmentController {
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }
    @PostMapping("/addAppointment")
    public Appointment addAppointment(@RequestBody Appointment appointment){
        return appointmentService.addAppointment(appointment);
    }
}
