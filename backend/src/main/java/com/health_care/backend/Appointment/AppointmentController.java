package com.health_care.backend.Appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    @PostMapping("/save-appointment")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        return service.saveAppointment(appointment);
    }
}
