package com.exemple.hospital.utils;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Validation {
    @Target({ ElementType.FIELD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @Constraint(validatedBy = ValidatorCNP.class)

    public @interface ValidCNP {
        String message() default "Validation failed";


        Class<?>[] groups() default {};

        Class<? extends Payload>[] payload() default {};
    }


}

