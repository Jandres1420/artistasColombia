package com.example.artistascolombianos.repositories;

import com.example.artistascolombianos.models.Artistas;
import com.example.artistascolombianos.models.Museos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuseosRepository extends JpaRepository<Museos, Integer> {
}
