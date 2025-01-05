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
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage()); // Pentru excepția "Doctor not found"
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<String> handleIllegalStateException(IllegalStateException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ex.getMessage()); // Pentru celelalte excepții
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("An unexpected error occurred: " + ex.getMessage());

    }



    @GetMapping("/get")
    public List<Appointment> getAllAppointment() {
        return appointmentServiceapi.getAllAppointment();
    }
}
