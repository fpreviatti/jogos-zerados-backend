package com.projeto.jogoszerados.controller;

import com.projeto.jogoszerados.model.Zerado;
import com.projeto.jogoszerados.service.ZeradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ZeradoController {

    @Autowired
    ZeradoService zeradoService;

    @GetMapping(value = "/zerados/{id}")
    public ResponseEntity<List<Zerado>> findZeradosByIdUsuario(@PathVariable Long id){
        List<Zerado> zerados = zeradoService.findZeradosByIdUsuario(id);
        return ResponseEntity.ok().body(zerados);
    }

    @DeleteMapping(value = "/zerados/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        zeradoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/zerados/{id}")
    public ResponseEntity<Zerado> save(@RequestBody Zerado zerado, @PathVariable Long id){
        Zerado zeradoSaved = zeradoService.save(zerado, id);

        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/zerados/{id}")
                .buildAndExpand(zeradoSaved.getZeradoId()).toUri();

        return ResponseEntity.created(uri).body(zeradoSaved);
    }

    @PutMapping(value = "/zerados/{id}")
    public ResponseEntity<Zerado> update(@PathVariable Long id, @RequestBody Zerado zerado){
        Zerado zeradoAtualizado = zeradoService.update(id, zerado);

        return ResponseEntity.ok().body(zeradoAtualizado);
    }

}
