package com.bihege.batchprocessingrecords.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRY_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor //This can be problematic if you need the arguments
public class Country {

    /* Continue video 36 minutes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COUNTRY_ID")
    private int id;
    */
    @Id
    @Column(name = "ENTITY")
    private String entity;

    @Column(name = "CODE")
    private String code;

    @Column(name = "YEAR")
    private int year;

    @Column(name = "PRIMARY_ENERGY_CONSUMPTION_TWH")
    private double consumption;
}
