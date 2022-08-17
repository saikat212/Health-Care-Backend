package com.health_care.backend.DC_Test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DC_TestRepository extends JpaRepository<DC_Test, Integer>  {

    @Query("SELECT DT from DC_Test DT  where DT.status ='pending' ")
    List<DC_Test> findPendingRequest();


    @Query(value = "select * from DC_Test"+
            " where status ='approved' and  t_id = :id",nativeQuery = true)
    List<DC_Test> findConfirmedRequest(@Param("id") Integer id);
//
//    @Query(value = "select * from DC_Test"+
//            " where status ='completed' and  dc_test_price.dc_id = :id ",nativeQuery = true)

//    @Query("SELECT D FROM DC_Test D JOIN DCTestList DTL "+
//            "ON(D.dcTestList.id = DTL.id)"+
//            "WHERE  D.status ='completed' "+
//            "AND D.dcTestList.dc.id = ?1 "
//    )

    @Query("SELECT D FROM DC_Test D JOIN DCTestList DTL "+
            "ON(D.dcTestList.id = DTL.id)"+
            "WHERE  D.dcTestList.dc.id = :id"+
            " AND D.status ='completed' "

    )
    List<DC_Test> findSubmittedRequest(Integer id);

}


