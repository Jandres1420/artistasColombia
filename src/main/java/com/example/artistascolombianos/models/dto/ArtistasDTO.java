package com.example.artistascolombianos.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArtistasDTO {
    private String tipo_ide;
    private String numero_ide;;
    private String nombres;
    private String apellidos;
}
