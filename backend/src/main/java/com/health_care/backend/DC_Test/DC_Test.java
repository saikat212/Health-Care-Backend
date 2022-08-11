package com.health_care.backend.DC_Test;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.health_care.backend.DiagnosticCenter.DiagnosticCenter;
import com.health_care.backend.Test.Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table

public class DC_Test {
    @Id
    @GeneratedValue
    private Integer id;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "dc_id", referencedColumnName = "id")
    private DiagnosticCenter dc;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "test_id", referencedColumnName = "id")
    private Test test;
    private double price;
}
