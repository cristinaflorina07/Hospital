package com.exemple.hospital.serviceAPI;

import com.exemple.hospital.entity.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentServiceAPI {
    List<Appointment> getAllAppointment();
    Appointment addAppointment(Appointment appointment);
    Optional<Appointment> getAppointmentById(Long id);
}
