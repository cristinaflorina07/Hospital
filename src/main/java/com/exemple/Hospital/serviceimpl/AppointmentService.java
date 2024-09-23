package com.exemple.Hospital.serviceimpl;

import com.exemple.Hospital.entity.Appointment;
import com.exemple.Hospital.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }
    public List<Appointment> getAppointment(){
        return appointmentRepository.findAll();
    }
    public Appointment addAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

}
