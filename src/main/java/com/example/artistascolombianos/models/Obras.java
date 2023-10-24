package com.example.artistascolombianos.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Obras")
public class Obras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idObras;

    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;

    @Column(name = "pais", nullable = false, length = 30)
    private String pais;


    @ManyToOne(targetEntity = Artistas.class)
    @JoinColumn(name = "idArtistas")
    private int idArtistas;

}
