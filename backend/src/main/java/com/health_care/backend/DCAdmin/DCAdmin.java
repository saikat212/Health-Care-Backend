package com.health_care.backend.DCAdmin;

import com.health_care.backend.DiagnosticCenter.DiagnosticCenter;
import com.health_care.backend.Person.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class DCAdmin {

    @Id
    private Integer id;
    private String dc_code;
    private String nid;
//
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
//    @JoinColumn(name = "dc_id", referencedColumnName = "id")
//    @MapsId
//    private DiagnosticCenter dc;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @MapsId
    private Person person;
}
