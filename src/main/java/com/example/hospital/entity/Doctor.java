package com.example.hospital.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
    @CollectionTable(name = "doctor_time_off", joinColumns = @JoinColumn(name = "doctor_id"))
    @AttributeOverrides({
            @AttributeOverride(name = "start", column = @Column(name = "time_off_start")),
            @AttributeOverride(name = "end", column = @Column(name = "time_off_end"))
    })
    private List<TimeInterval> timeOff = new ArrayList<>();

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments;


}

