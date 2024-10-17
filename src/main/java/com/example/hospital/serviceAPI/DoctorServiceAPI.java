package com.example.hospital.serviceAPI;

import com.example.hospital.entity.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorServiceAPI {
    List<Doctor> getAllDoctor();
    Doctor addDoctor(Doctor doctor);
    Optional<Doctor> findDoctorById(Long id);
}
