package com.health_care.backend.Test_Prescription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_care.backend.Test.Test;

@Service
public class Test_PrescriptionService {
    @Autowired
    private Test_PrescriptionRepository repository;
    
    public Test_Prescription saveTest(Test_Prescription t){
        return repository.save(t);
    }
    public List<Test_Prescription> getAllTest(){
        return repository.findAll();
    }
}
