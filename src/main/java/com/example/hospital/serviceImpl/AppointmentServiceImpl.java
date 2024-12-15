package com.example.hospital.serviceImpl;

import com.example.hospital.entity.Doctor;
import com.example.hospital.entity.TimeInterval;
import com.example.hospital.repository.AppointmentRepository;
import com.example.hospital.entity.Appointment;
import com.example.hospital.repository.DoctorRepository;
import com.example.hospital.serviceAPI.AppointmentServiceAPI;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentServiceAPI {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository, DoctorRepository doctorRepository) {
        this.appointmentRepository = appointmentRepository;
        this.doctorRepository = doctorRepository;
    }


    public Appointment createAppointment(Appointment appointment) {
        Doctor doctor = doctorRepository.findById(appointment.getDoctor().getId())
                .orElseThrow(() -> new RuntimeException("Doctor not found"));
        // Verificăm dacă programarea se suprapune cu timpul liber al doctorului
        for (TimeInterval timeOff : doctor.getTimeOff()) {
            if (appointment.getAppointmentStart().isBefore(timeOff.getEnd()) &&
                    appointment.getAppointmentEnd().isAfter(timeOff.getStart())) {
                throw new IllegalStateException("Doctor is not available during the specified time.");
            }
            // Verificăm suprapunerile între programări
            boolean overlaps = appointmentRepository.existsByDoctorAndAppointmentStartLessThanAndAppointmentEndGreaterThan(
                    doctor,
                    appointment.getAppointmentEnd(),
                    appointment.getAppointmentStart()
            );

            if (overlaps) {
                throw new IllegalStateException("Appointment overlaps with an existing appointment.");
            }
        }
            return appointmentRepository.save(appointment);
        }


        public List<Appointment> getAllAppointment () {
            return appointmentRepository.findAll();
        }


        public Appointment addAppointment (Appointment appointment){

            return appointmentRepository.save(appointment);
        }

        public List<Appointment> getAllAppointment (Appointment appointment){
            return appointmentRepository.findAll();
        }

        public Optional<Appointment> getAppointmentById (Long id){
            return appointmentRepository.findById(id);

        }
    }
