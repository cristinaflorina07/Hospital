package com.example.hospital.serviceAPI;

import com.example.hospital.entity.Appointment;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface AppointmentServiceAPI {
    Appointment createAppointment(Appointment appointment);

    List<Appointment> getAllAppointment();

    Appointment addAppointment(Appointment appointment);

    Optional<Appointment> getAppointmentById(Long id);
}
