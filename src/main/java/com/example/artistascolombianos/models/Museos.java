package com.example.artistascolombianos.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Museos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMuseos;

    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Column(name = "pais", nullable = false, length = 30)
    private String pais;

    @Column(name = "ciudad", nullable = false, length = 30)
    private String ciudad;

    @Column(name = "direccion", nullable = false, length = 30)
    private String direccion;



}
