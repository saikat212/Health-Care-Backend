package com.health_care.backend.Medicine;

import java.sql.Date;

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
public class Medicine {
    @Id
    @GeneratedValue

    private Integer id;
    private String name;
    private double weight;
    private Date expirydate;
}
