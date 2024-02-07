package com.health_care.backend.Appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health_care.backend.Patient.Patient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    @PostMapping("/save-appointment")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        return service.saveAppointment(appointment);
    }
    @PostMapping("/get-AppointmentList")
    public List<Appointment> getAppointmentList(@RequestBody Map<String,String> map){
        int _id = Integer.parseInt(map.get("id")) ;
        String status = map.get("status");
        return service.getAppointments(_id, status);
    }
    @PutMapping("/appointment-confirmation")
    void  updateAppointment(@RequestBody Appointment appointment){
         service.updateAppointment(appointment);
    }
    @PostMapping("/update-appointemnt")
    void updateAppoinmentByPrescription(@RequestBody Appointment appointment){
        service.updatePrescriptionId(appointment.getId(),appointment.getPrescription().getId());
    }
    @GetMapping("/get-all-appointments/{id}")
    public List<Appointment> getAppointmentByPatientId(@PathVariable Integer id){
        return service.getAppointmentByPatientId(id);
    }
    @PostMapping("/update-status")
    void updateStatus(@RequestBody Appointment appt){
        service.updateStatus(appt);
    }
   
}
