package com.health_care.backend.Appointment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_care.backend.Patient.Patient;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository repository;

    public Appointment saveAppointment(Appointment appointment){
        System.out.println(appointment);
        return repository.save(appointment);
    }
    public List<Appointment> getAppointments(Integer id, String status){
        System.out.println("In serviceF : "+id+" "+status);
        return repository.findAppointments(id,status);
    }
   void  updateAppointment(Appointment appointment){
         repository.updateAppoinment(appointment.getDateGivenByDoctor(),appointment.getCommentFromDoctor(),appointment.getStatus(),appointment.getId());
    }
    void updatePrescriptionId(Integer id,Integer pid){
        repository.updatePrescriptionId(id,pid);
    }
   
}
