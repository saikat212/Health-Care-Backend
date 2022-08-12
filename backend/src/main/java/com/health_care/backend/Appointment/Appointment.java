package com.health_care.backend.Appointment;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.health_care.backend.Doctor.Doctor;
import com.health_care.backend.Patient.Patient;
import com.health_care.backend.Payment.Payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Appointment {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;
    @ManyToOne( fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private Doctor doctor;
    private Date date;
    @OneToOne( fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "payment_id", referencedColumnName = "id")
    private Payment payment;
    private String problem;
    private String status; //pending, approved, rejected, closed
    private String commentFromDoctor;
    private Date dateGivenByDoctor;
}
