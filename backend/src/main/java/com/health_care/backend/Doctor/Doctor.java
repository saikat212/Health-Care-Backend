package com.health_care.backend.Doctor;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.health_care.backend.Person.Person;
import com.health_care.backend.Specialities.Speciality;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Doctor{
    @Id
    private Integer id;
    private String chamber;
    private String bmdcNo;
    private String nid;
    private double experience;
    private double fee;
    private String degree;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "speciality_id", referencedColumnName = "id")
    private Speciality speciality;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @MapsId
    private Person person;
}
