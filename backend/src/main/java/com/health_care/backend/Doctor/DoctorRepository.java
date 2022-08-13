package com.health_care.backend.Doctor;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DoctorRepository extends JpaRepository<Doctor,Integer>{


    Doctor[] findBySpecialityId(Integer id);

     @Query("SELECT D FROM Doctor D JOIN Person P "+
     "ON(P.id = D.id)"+
     "WHERE P.firstName LIKE CONCAT('%',:query,'%') "+
     "OR P.lastName LIKE CONCAT('%',:query,'%')"
     )
    Doctor[] searchDoctorsByName(String query);
    @Modifying
    @Transactional
    @Query(value = "update doctor "+ 
    "set visiting_day = :visitingDay, "+
    "visiting_time = :visitingTime "+
    "where id = :id",nativeQuery = true)
    void updateVisitingDayTime(String visitingDay, String visitingTime, Integer id);
    
}
