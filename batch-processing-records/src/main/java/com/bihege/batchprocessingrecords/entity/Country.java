package com.bihege.batchprocessingrecords.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRY_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Id
    //@GeneratedValue
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "Entity")
    private String entity;

    @Column(name = "Code")
    private String code;

    @Column(name = "Year")
    private int year;

    @Column(name = "Primary_energy_consumption_twh")
    private double consumption;
}
