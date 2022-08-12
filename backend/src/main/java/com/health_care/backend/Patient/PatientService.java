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
    public void updateByHW(Patient patient){
        System.out.println("Tesssssssssssssssssssssssssssssssss");
        System.out.println(patient.getHeight()+" "+ patient.getWeight()+" "+ patient.getId());
        repository.updateByHW(patient.getHeight(), patient.getWeight(), patient.getId());
    }
}
