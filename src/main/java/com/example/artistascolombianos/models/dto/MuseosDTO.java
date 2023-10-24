package com.example.artistascolombianos.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MuseosDTO {

    private String nombre;


    private String pais;


    private String ciudad;


    private String direccion;
}
