package com.health_care.backend.Doctor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health_care.backend.Person.Person;
import com.health_care.backend.Person.PersonService;

@RestController
@CrossOrigin
public class DoctorController {
    @Autowired
    private DoctorService service;
    private PersonService pService;
    @PostMapping("/addDoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        System.out.println(doctor);
        return service.saveDoctor(doctor);
    }
    @GetMapping("/doctor-id/{id}")
    public Doctor getDoctorById(@PathVariable int id){
        return service.findDoctorbyId(id);
    }
    @GetMapping("/get-doctor-by-first-name/{name}")
    public Doctor getDoctorByFirstName(@PathVariable String name){
        Person person = pService.getPersonByFirstName(name);
        return service.findDoctorbyId(person.getId());
    }
    @GetMapping("/get-doctor-by-last-name/{name}")
    public Doctor getDoctorByLastName(@PathVariable String name){
        Person person = pService.getPersonByLastName(name);
        return service.findDoctorbyId(person.getId());
    }
    @GetMapping("/get-doctor-by-speciality/{id}")
    public Doctor[] getDoctorsBySpeciality(@PathVariable Integer id){
        return service.getDoctorBySpeciality(id);
    }
    @GetMapping("/search-doctor/{query}")
    public Doctor[] searchDoctors(@PathVariable String query){
        return service.searchDoctors(query);
    }
    @PutMapping("/updateVisitingTime")
    public void updateVisitingDayTime(@RequestBody Doctor doctor){
        service.updateVisitingDayTime(doctor);
    }

}
