package com.exemple.hospital.serviceImpl;

import com.exemple.hospital.entity.Doctor;
import com.exemple.hospital.repository.DoctorRepository;
import com.exemple.hospital.serviceAPI.DoctorServiceAPI;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DoctorServiceImpl implements DoctorServiceAPI {
    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getDoctor() {
        return doctorRepository.findAll();

    }


    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Optional<Doctor> findDoctorById(Long id) {
        return doctorRepository.findById(id);
    }

}
