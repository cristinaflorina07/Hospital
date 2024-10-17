package com.example.hospital.serviceImpl;

import com.example.hospital.entity.Doctor;
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


    //   Metodă care validează dacă doctorul este în concediu la data programării
    private void timeOffCheck(Doctor doctor, LocalDateTime registerHour) {
        LocalDate dataAppointment = registerHour.toLocalDate();
        if (doctor.getTimeOff().contains(dataAppointment)) {
            throw new RuntimeException("Doctorul este în concediu în această zi.");
        }
    }

    public Appointment saveAppointment(Long doctorId, LocalDateTime registerHour) {
        // Găsește doctorul și aruncă excepție dacă nu este găsit
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctorul nu a fost găsit!"));

        timeOffCheck(doctor, registerHour);
        // Verifică dacă doctorul este în concediu
        timeOffCheck(doctor, registerHour);

        // Creează și salvează programarea
        Appointment appointment = new Appointment();
        appointment.setDoctor(doctor);
        appointment.setSection(doctor.getSection());
        appointment.setRegisterHour(registerHour);
        appointment.setAvailable(true); // Programarea este disponibilă

        return appointmentRepository.save(appointment);
    }


    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }


    public Appointment addAppointment(Appointment appointment) {

        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAllAppointment(Appointment appointment) {
        return appointmentRepository.findAll();
    }

    public Optional<Appointment> getAppointmentById(Long id) {
        return appointmentRepository.findById(id);

    }
}
