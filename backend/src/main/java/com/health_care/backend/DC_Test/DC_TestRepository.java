package com.health_care.backend.DC_Test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DC_TestRepository extends JpaRepository<DC_Test, Integer>  {

    @Query("SELECT DT from DC_Test DT  where DT.status ='pending' ")
    List<DC_Test> findPendingRequest();

    @Query("SELECT DT from DC_Test DT  where DT.status ='approved'")
    List<DC_Test> findConfirmedRequest();

}
