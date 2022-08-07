package com.health_care.backend.Payment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Payment {
    @Id
    @GeneratedValue
    
    private int id;
    private String method;
    private double amount;
    private String acc_no;
}
