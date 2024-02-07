package com.health_care.backend.Test_Prescription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_care.backend.Test.Test;

@Service
public class Test_PrescriptionService {
    @Autowired
    private Test_PrescriptionRepository repository;
    
    public void saveTest(Test_Prescription t){
         repository.save(t);
    }
    public List<Test_Prescription> getAllTest(Integer id){
          return repository.findByPrescriptionId(id);
    }
}
