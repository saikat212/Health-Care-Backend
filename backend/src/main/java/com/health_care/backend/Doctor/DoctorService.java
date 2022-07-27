package com.health_care.backend.Doctor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_care.backend.Person.Person;
import com.health_care.backend.Person.PersonRepository;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository repository;
    private PersonRepository pRepository;
    public Doctor saveDoctor(Doctor doctor){
        return repository.save(doctor);
    }
    public Doctor findDoctorbyId(int id){
        return repository.findById(id).orElse(null);
    }
    public Doctor getDoctorByFirstName(String name){
        Person person = pRepository.findByFirstName(name);
        int id = person.getId();
       return findDoctorbyId(id);
    }
    public Doctor getDoctorByLastName(String name){
        Person person = pRepository.findByLastName(name);
        int id = person.getId();
       return findDoctorbyId(id);
        
    }
    


}
