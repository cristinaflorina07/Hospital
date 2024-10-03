package com.exemple.Hospital.entity;

import com.exemple.Hospital.utils.Validation;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
public class PersonalPatientData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String secondName;
    private LocalDate dateOfBirth;
    private int age;
    private String gender;
    private String nationalIdentificationNumber;
    private String homeAddress;
  @Size(min = 10, max = 10, message = "phoneNumber must be exactly 10")
    private String phoneNumber;
    @Validation.ValidCNP
    private String cnp;

}
