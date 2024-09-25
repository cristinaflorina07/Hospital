package com.exemple.Hospital.serviceapi;

import com.exemple.Hospital.entity.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentServiceapi {
    List<Appointment> getAllApointment();
    Appointment addApointment(Appointment appointment);
    Optional<Appointment> getApointmentById(Long id);
}
