package com.example.hospital.utils;
import com.example.hospital.entity.PersonalPatientData;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidatorCNP implements ConstraintValidator<Validation.ValidCNP, String> {
    public void initialize(Validation.ValidCNP constraintAnnotation) {
    }
    PersonalPatientData personalPatientData = new PersonalPatientData();
    public boolean isValid(String cnp, ConstraintValidatorContext context) {
        // CNP trebuie să aibă exact 13 caractere
        if (cnp == null || cnp.length() != 13) {
            return false;
        }
        if (!cnp.matches("\\d+")) {
            return false;
        }
//        // Verificarea primei cifre din CNP în funcție de sex
//        char firstDigit = cnp.charAt(0);
//        String gender = personalPatientData.getGender();
//
//            if ("M".equalsIgnoreCase(gender)) {
//                if (firstDigit != '1' && firstDigit != '5' && firstDigit != '3' && firstDigit != '7') {
//                    return false; // Invalid CNP for males
//                }
//            } else if ("F".equalsIgnoreCase(gender)) {
//                if (firstDigit != '2' && firstDigit != '6' && firstDigit != '4' && firstDigit != '8') {
//                    return false; // Invalid CNP for females
//                }
//            } else {
//                return false; // Gender is neither "M" nor "F"
//            }

        return true;

//        // Logica pentru verificarea cifrei de control, similară cu exemplul anterior
//        int[] weights = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
//        int sum = 0;
//        for (int i = 0; i < 12; i++) {
//            sum += Character.getNumericValue(cnp.charAt(i)) * weights[i];
//
//            }
//
//        int controlDigit = sum % 11;
//        if (controlDigit == 10) {
//            controlDigit = 1;
//        }
//
//        return controlDigit == Character.getNumericValue(cnp.charAt(12));
//    }

    }}


