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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COUNTRY_ID")
    private int id;

    @Column(name = "ENTITY")
    private String entity;

    @Column(name = "CODE")
    private String code;

    @Column(name = "YEAR")
    private int year;

    @Column(name = "PRIMARY_ENERGY_CONSUMPTION_TWH")
    private double consumption;
}
