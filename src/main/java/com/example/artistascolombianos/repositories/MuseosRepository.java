package com.example.artistascolombianos.repositories;

import com.example.artistascolombianos.models.Artistas;
import com.example.artistascolombianos.models.Museos;
import com.example.artistascolombianos.models.Obras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MuseosRepository extends JpaRepository<Museos, Integer> {
    @Query("SELECT p FROM Museos p WHERE p.ciudad = :city AND p.nombre LIKE 'L%'")
    Optional<Museos> findByCiudadStartingWithL(@Param("city") String city);
}
