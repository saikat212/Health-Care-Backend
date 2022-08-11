package com.health_care.backend.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DoctorRepository extends JpaRepository<Doctor,Integer>{


    Doctor[] findBySpecialityId(Integer id);

     @Query("SELECT D FROM Doctor D JOIN Person P "+
     "ON(P.id = D.id)"+
     "WHERE P.firstName LIKE CONCAT('%',:query,'%') "+
     "OR P.lastName LIKE CONCAT('%',:query,'%')"
     )
    Doctor[] searchDoctorsByName(String query);
    
}
