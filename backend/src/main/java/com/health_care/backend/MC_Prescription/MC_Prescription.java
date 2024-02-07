package com.health_care.backend.MC_Prescription;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.health_care.backend.Medicine.Medicine;
import com.health_care.backend.Prescription.Prescription;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class MC_Prescription {
    @Id
    @GeneratedValue
    private Integer id;
    private String dose;
    private String duration;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "prescription_id", referencedColumnName = "id")
    private Prescription prescription;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "medicine_id", referencedColumnName = "id")
    private Medicine medicine;

}
