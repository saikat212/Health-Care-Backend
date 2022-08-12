package com.health_care.backend.Patient;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface PatientRepository extends JpaRepository<Patient, Integer> {
    @Modifying
    @Transactional
    @Query(value = "update patient "+ 
    "set height = :d, "+
    "weight = :w "+
    "where id = :id",nativeQuery = true)
    void updateByHW(double d, double w, Integer id);
    
}
