package com.health_care.backend.Patient;


import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient, Integer> {

    //Patient findByFirstName(String first_name);
    
}
