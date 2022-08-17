//package com.health_care.backend.DCTestPrice;
//
//
//import com.health_care.backend.DiagnosticCenter.DiagnosticCenter;
//import com.health_care.backend.Patient.Patient;
//import com.health_care.backend.Taker.Taker;
//import com.health_care.backend.Test.Test;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table
//public class DCTestPrice {
//
//
//    @Id
//    @GeneratedValue
//    private Integer id;
//    private String price;
//
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
//    @JoinColumn(name = "dc_id", referencedColumnName = "id")
//    private DiagnosticCenter dc;
//
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
//    @JoinColumn(name = "test_id", referencedColumnName = "id")
//    private Test test;
//
//
//}
