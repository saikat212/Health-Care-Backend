package com.health_care.backend.MC_Prescription;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MC_PrescriptionRepository extends JpaRepository<MC_Prescription,Integer>{

    List<MC_Prescription> findByPrescriptionId(int id);
    
}
