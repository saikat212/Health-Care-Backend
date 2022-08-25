package com.health_care.backend.DC_Test;

import net.bytebuddy.utility.nullability.UnknownNull;
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

    @Query(value = "select * from DC_Test"+
            " where status ='completed' and  t_id = :id",nativeQuery = true)
    List<DC_Test> getCompletedService(@Param("id") Integer id);

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

    @Query("SELECT D FROM DC_Test D JOIN DCTestList DTL "+
            "ON(D.dcTestList.id = DTL.id)"+
            "WHERE  D.dcTestList.dc.id = :id"+
            " AND D.status ='pack' "

    )
    List<DC_Test> getPendingACK(Integer id);


//    @Query(value = " select D from DC_Test D join DCTest_List DTL on(D.dc_test_price = DTL.id) where  D.status = 'completed' and DTL.dc_id = 92 " ,nativeQuery = true)
//    List<DC_Test> findSubmittedRequest(@Param("id") Integer id);

//
    @Query("SELECT D FROM DC_Test D JOIN DCTestList DTL "+
            "ON(D.dcTestList.id = DTL.id)"+
            "WHERE  D.status = 'pending' "+
            " AND D.dcTestList.isOnlineTestAvailable ='no' "

    )
    List<DC_Test> findOffsitePending();

//    @Query(value = "select D from DC_Test D join DCTest_List DTL on(D.dc_test_price = DTL.id) where  D.status = 'pending' and DTL.is_online_test_available ='no' " ,nativeQuery = true )
//    List<DC_Test> findOffsitePending();

}


