package com.health_care.backend.DiagnosticCenter;


import javax.persistence.*;

import com.health_care.backend.Person.Person;
import com.health_care.backend.TakerSpeciality.TakerSpeciality;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class DiagnosticCenter {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String location;
    private String isOfferOnsiteTest; // 1 = offer -------- 0 = don't offer
    private String registrationNum;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "admin_id", referencedColumnName = "id")
    private Person person;
    
}
