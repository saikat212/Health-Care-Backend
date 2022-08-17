package com.health_care.backend.MC_Prescription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MC_PrescriptionService {
    @Autowired
    private MC_PrescriptionRepository repository;

    public List<MC_Prescription> getAll(){
        return repository.findAll();
    }
    public void saveMedicine(MC_Prescription p){
         repository.save(p);
    }
}
