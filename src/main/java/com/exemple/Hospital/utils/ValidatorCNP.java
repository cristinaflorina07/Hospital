package com.exemple.Hospital.utils;
import com.exemple.Hospital.entity.PersonalPatientData;
import com.exemple.Hospital.utils.Validation;
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
        // Verificarea primei cifre din CNP în funcție de sex
        char firstDigit = cnp.charAt(0);
        if (personalPatientData.getGender().equalsIgnoreCase("M")) {
            if (firstDigit != '1' && firstDigit != '5' && firstDigit != '3' && firstDigit != '7') {
                return false; // CNP invalid pentru bărbați
            }
        } else if (personalPatientData.getGender().equalsIgnoreCase("F")) {
            if (firstDigit != '2' && firstDigit != '6' && firstDigit != '4' && firstDigit != '8') {
                return false; // CNP invalid pentru femei
            }
        } else {
            return false; // Sexul nu este "M" sau "F"
        }
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


