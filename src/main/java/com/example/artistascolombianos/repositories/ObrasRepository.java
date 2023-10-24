package com.example.artistascolombianos.repositories;

import com.example.artistascolombianos.models.Artistas;
import com.example.artistascolombianos.models.Obras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ObrasRepository extends JpaRepository<Obras, Integer> {

    @Query("SELECT p FROM Obras p WHERE p.pais= :name AND p.idArtistas =:artista")
    Optional<Obras> findByColombia(@Param("name") String name,@Param("artista") Artistas artistas);
}
