package com.health_care.backend.DCTestList;

import javax.persistence.*;

import com.health_care.backend.DiagnosticCenter.DiagnosticCenter;
import com.health_care.backend.Patient.Patient;

import com.health_care.backend.Prescription.Prescription;

import com.health_care.backend.Test.Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table

public class DCTestList {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "dc_id", referencedColumnName = "id")
    private DiagnosticCenter dc;

    @ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "test_id", referencedColumnName = "id")
    private Test test;
    private Integer price; // let int
    private String isOnlineTestAvailable; // 1 = available -------- 0 = not available

}
