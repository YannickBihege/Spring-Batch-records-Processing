package com.bihege.batchprocessingrecords.entity;


import javax.persistence.*;

@Entity
@Table(name="COUNTRY_INFO")
public class Country {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="Entity")
    private String entity ;

    @Column(name="Code")
    private String code;

    @Column(name="Year")
    private int year ;

    @Column(name="Primary energy consumption(Twh)")
    private double consumption;
}
