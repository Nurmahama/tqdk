package com.Telebe.ImtahanMerkezi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data

@NoArgsConstructor
@AllArgsConstructor

@Entity (name = "ImtahanMerkezi1")
public class Acount {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    private Long id;
    private  String Name;
    private String Surname;
    private  double AvgMath;
    private  double AvgGeography;
    private  double AvgExcamel;

}
