package com.example.hospital.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class MedicalInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String medicalInformation;
    private String currentTreatment;
    private String chronicCondition;
    @ElementCollection
    private List<String> knowsAllergies;
    private String vaccinations;
}
