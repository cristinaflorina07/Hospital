package com.exemple.Hospital.serviceimpl;

import com.exemple.Hospital.entity.Appointment;
import com.exemple.Hospital.repository.AppointmentRepository;
import com.exemple.Hospital.serviceapi.AppointmentServiceapi;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceimpl implements AppointmentServiceapi {
    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceimpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }


    public List<Appointment> getAllApointment() {
        return appointmentRepository.findAll();
    }


    public Appointment addApointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }


    public Optional<Appointment> getApointmentById(Long id) {
        return appointmentRepository.findById(id);

    }
}
