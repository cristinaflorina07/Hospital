package com.exemple.hospital.serviceImpl;

import com.exemple.hospital.entity.Appointment;
import com.exemple.hospital.repository.AppointmentRepository;
import com.exemple.hospital.serviceAPI.AppointmentServiceAPI;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentServiceAPI {
    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }


    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }


    public Appointment addAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }


    public Optional<Appointment> getAppointmentById(Long id) {
        return appointmentRepository.findById(id);

    }
}
