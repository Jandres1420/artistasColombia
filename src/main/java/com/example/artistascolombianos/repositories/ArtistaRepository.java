package com.example.artistascolombianos.repositories;

import com.example.artistascolombianos.models.Artistas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artistas, Integer> {

}
