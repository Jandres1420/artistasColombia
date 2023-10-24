package com.example.artistascolombianos.models.dto;

import com.example.artistascolombianos.models.Artistas;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ObrasDto {

    private String nombre;
    private String pais;
    private int idArtistas;

}
