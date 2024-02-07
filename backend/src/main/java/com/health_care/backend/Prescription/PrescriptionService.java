package com.health_care.backend.Prescription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {
    @Autowired
    private PrescriptionRepository repository;

    public Prescription savePrescription(Prescription p){
       return repository.save(p);
    }
}
