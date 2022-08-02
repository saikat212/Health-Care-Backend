package com.health_care.backend.Medicine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepository repository;

    public List<Medicine> getAllMedicine(){
        return repository.findAll();
    }
}
