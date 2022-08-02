package com.health_care.backend.Specialities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Speciality {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;
    
    public Speciality(String name) {
        this.name = name;
    }

    public Speciality(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    



}
