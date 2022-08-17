package com.health_care.backend.DC_Test;

import javax.persistence.*;

import com.health_care.backend.DCTestList.DCTestList;
import com.health_care.backend.DiagnosticCenter.DiagnosticCenter;
import com.health_care.backend.Patient.Patient;
import com.health_care.backend.Taker.Taker;

import com.health_care.backend.Test.Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.lang.Nullable;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table

public class DC_Test {  //  dc appointment
    @Id
    @GeneratedValue
    private Integer id;
    private Date Date;
    private String status;
    private String location;
    private String report;
    
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
//    @JoinColumn(name = "dc_id", referencedColumnName = "id")
//    private DiagnosticCenter dc;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "dc_test_price", referencedColumnName = "id")
    private DCTestList dcTestList;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "p_id", referencedColumnName = "id")
    private Patient patient;



    // this property so that not null value can be assign
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "t_id", referencedColumnName = "id",nullable = true)
    private Taker taker;


}


