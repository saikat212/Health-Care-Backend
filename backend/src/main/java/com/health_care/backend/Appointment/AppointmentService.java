package com.health_care.backend.Appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository repository;

    public Appointment saveAppointment(Appointment appointment){
        return repository.save(appointment);
    }
}
