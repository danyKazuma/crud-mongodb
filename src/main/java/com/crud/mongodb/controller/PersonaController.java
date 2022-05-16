package com.crud.mongodb.controller;

import com.crud.mongodb.model.Persona;
import com.crud.mongodb.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/api/v1")
public class PersonaController {
    private final PersonaService personaService;

    @PostMapping(value="/cliente")
    public void save(@RequestBody Persona persona){
        personaService.save(persona);
    }

    @GetMapping(value="/consultar")
    public List<Persona> findAll(){
        return personaService.findAll();
    }

    @GetMapping(value="/buscar/{id}")
    public Persona findById(@PathVariable String id){
        return personaService.findById(id).get();
    }

    @DeleteMapping(value="/borrar/{id}")
    public void deleteById(@PathVariable String id){
        personaService.deleteById(id);
    }

    @PutMapping(value="cliente")
    public void update(@RequestBody Persona persona){
        personaService.save(persona);
    }
}
