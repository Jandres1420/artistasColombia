package com.example.artistascolombianos.services;

import com.example.artistascolombianos.models.dto.MuseosDTO;

public interface ArtistaServiecInt {
    void getMuseosCiudadL(String ciudad);

    void createMuseo(MuseosDTO museosDTO);
}
