package com.health_care.backend.Patient;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_care.backend.Person.PersonService;

@Service
public class PatientService {
    @Autowired
    private PatientRepository repository;

    @Autowired
    private PersonService service;

    public Patient savePatient(Patient patient){
        return repository.save(patient);
    }
    public Optional<Patient> findPatientById(int id){
        return repository.findById(id);
    }
    /* public Patient findPatientByFirstName(String first_name){
        return repository.findByFirstName(first_name);
    } */
}
