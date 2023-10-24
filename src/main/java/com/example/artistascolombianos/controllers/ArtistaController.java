package com.example.artistascolombianos.controllers;

import com.example.artistascolombianos.models.Artistas;
import com.example.artistascolombianos.models.dto.ArtistasDTO;
import com.example.artistascolombianos.services.ArtistaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping()
public class ArtistaController {

    private final ArtistaService artistaService;

    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    @GetMapping("/getArtista")
    public Artistas getArtista(@RequestParam int idArtistas){
        artistaService.getArtista(idArtistas);
        return null;
    }

    @PostMapping("/postArtista")
    public ResponseEntity<Artistas> createArtista(@RequestBody @Valid @NotNull @NotEmpty ArtistasDTO artistasDTO){
        System.out.println("" + artistasDTO.getNombres() + "\n" + artistasDTO.getApellidos() );
        artistaService.createArtista(artistasDTO);
        return null;
    }

    @PutMapping("/putArtista")
    public ResponseEntity<Artistas> modifyArtista(@RequestBody @Valid @NotNull @NotEmpty ArtistasDTO artistasDTO){
        System.out.println("" + artistasDTO.getNombres() + "\n" + artistasDTO.getApellidos() );
        artistaService.createArtista(artistasDTO);
        return null;
    }

    @DeleteMapping("/deleteArtista")
    public void deleteArtista(@PathVariable(name = "idArtistas") String idArtista){
        artistaService.deleteArtista(Integer.parseInt(idArtista));
    }

    @GetMapping("/getObrasColombia")
    public Artistas getObrasColombia(@RequestParam int idArtistas){
        System.out.println(idArtistas);
        artistaService.getObrasColombia(idArtistas);
        return null;
    }
}
