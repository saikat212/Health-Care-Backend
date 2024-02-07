package com.health_care.backend.Test_Prescription;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Test_PrescriptionRepository extends JpaRepository<Test_Prescription,Integer>{

    List<Test_Prescription> findByPrescriptionId(Integer id);
    
}
