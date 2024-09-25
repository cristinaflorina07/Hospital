package com.exemple.Hospital.controller;

import com.exemple.Hospital.entity.Appointment;
import com.exemple.Hospital.serviceapi.AppointmentServiceapi;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Appointment")
public class AppointmentController {
    private final AppointmentServiceapi appointmentServiceapi;

    public AppointmentController(AppointmentServiceapi appointmentServiceapi) {
        this.appointmentServiceapi = appointmentServiceapi;
    }

    @PostMapping("/addAppointment")
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        return appointmentServiceapi.addApointment(appointment);
    }
    @GetMapping("/getAppointment")
    public List<Appointment> getAllAppointment(){
        return appointmentServiceapi.getAllApointment();
    }
}
