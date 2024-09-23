package com.exemple.Hospital.utils;

import com.exemple.Hospital.entity.Appointment;
import com.exemple.Hospital.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Formatter;
import java.util.List;

@Service
public class DataService {
 private final AppointmentRepository appointmentRepository;

    public DataService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }


public void hour(){
    List<Appointment> listAppointment = appointmentRepository.findAll();

    // Create Formatter class object
    Formatter format = new Formatter();

    // Creating a calendar
    Calendar gfg_calender = Calendar.getInstance();

    // Displaying hour using Format class using  format
    // specifiers
    // '%tl' for hours and '%tM' for minutes
    format = new Formatter();
    format.format("%tl:%tM", gfg_calender,
            gfg_calender);


}
}
