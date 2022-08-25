package com.health_care.backend.DCTestList;

import com.health_care.backend.DiagnosticCenter.DiagnosticCenter;
import com.health_care.backend.Doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

    @Query(value = "select * from dctest_list"+
            " where dc_id = :id",nativeQuery = true)
    List<DCTestList> getTestListByDCId(@Param("id") Integer id);

}
