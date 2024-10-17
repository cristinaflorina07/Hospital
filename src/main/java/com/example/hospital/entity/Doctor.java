package com.example.hospital.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String secondName;
    private String section;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(length = 10)
    private String phoneNumber;
    @ElementCollection
    private List<LocalDate> timeOff;
//    @ElementCollection
//    private List<LocalDateTime> anotherAppointment;
}
