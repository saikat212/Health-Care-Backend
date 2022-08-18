package com.health_care.backend.DiagnosticCenter;

import com.health_care.backend.DC_Test.DC_Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DiagnosticCenerRepository extends JpaRepository<DiagnosticCenter,Integer> {
    @Query(value = "select * from Diagnostic_Center"+
            " where admin_id = :id",nativeQuery = true)
    DiagnosticCenter getDCByAdminId(@Param("id") Integer id);
}
