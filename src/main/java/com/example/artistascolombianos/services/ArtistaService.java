package com.example.artistascolombianos.services;

import com.example.artistascolombianos.models.Artistas;
import com.example.artistascolombianos.models.dto.ArtistasDTO;
import com.example.artistascolombianos.repositories.ArtistaRepository;
import com.example.artistascolombianos.repositories.ObrasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArtistaService {

    private final ArtistaRepository artistaRepository;
    private final ObrasRepository obrasRepository;

    public void createArtista(ArtistasDTO artistasDTO){
        Artistas artistas = Artistas.builder()
                .nombres(artistasDTO.getNombres())
                .apellidos(artistasDTO.getApellidos())
                .tipo_ide(artistasDTO.getTipo_ide())
                .numero_ide(artistasDTO.getNumero_ide())
                .build();
        artistaRepository.save(artistas);
    }

    public void getArtista(int idArtistas) {
        System.out.println(artistaRepository.getById(idArtistas));
    }

    public void deleteArtista(int idArtistas) {
        artistaRepository.deleteById(idArtistas);
    }

    public void getObrasColombia(int idArtistas) {
        Optional<Artistas> optionalArtistas = artistaRepository.findById(idArtistas);
        Artistas artistas = new Artistas();
        if(optionalArtistas.isPresent()){
            artistas = optionalArtistas.get();
        }
        obrasRepository.findByColombia("Colombia", artistas);
    }
}
