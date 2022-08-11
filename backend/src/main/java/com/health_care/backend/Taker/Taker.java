package com.health_care.backend.Taker;


import com.health_care.backend.Person.Person;
import com.health_care.backend.Specialities.Speciality;
import com.health_care.backend.TakerSpeciality.TakerSpeciality;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Taker {

    @Id
    private Integer id;
    private String pathology_registration_no;
    private String nid;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "takerSpeciality_id", referencedColumnName = "id")
    private TakerSpeciality takerSpeciality;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @MapsId
    private Person person;
}


