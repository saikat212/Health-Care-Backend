package com.health_care.backend.DCTestList;

import com.health_care.backend.Doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DCTestListRepository extends JpaRepository<DCTestList, Integer> {

//
//    @Query("SELECT D FROM DCTestList D JOIN Person P "+
//            "ON(P.id = D.id)"+
//            "WHERE P.firstName LIKE CONCAT('%',:query,'%') "+
//            "OR P.lastName LIKE CONCAT('%',:query,'%')"
//    )
    @Query("SELECT D FROM DCTestList D JOIN Test T "+
            "ON(T.id = D.test.id)"+
            "WHERE T.name LIKE CONCAT('%',:testname,'%') "
    )
    List<DCTestList> findDCByTestname(String testname);

}
