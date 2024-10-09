package com.exemple.hospital.serviceapi;

import com.exemple.hospital.entity.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorServiceAPI {
    List<Doctor> getDoctor();
    Doctor addDoctor(Doctor doctor);
    Optional<Doctor> findDoctorById(Long id);
}
