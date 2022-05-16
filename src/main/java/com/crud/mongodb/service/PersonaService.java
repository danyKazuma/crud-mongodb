package com.crud.mongodb.service;

import com.crud.mongodb.model.Persona;
import com.crud.mongodb.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonaService {
    private final PersonaRepository personaRepository;

    //Grabar registro
    public void save(Persona persona){
        personaRepository.save(persona);
    }

    //Listar todos los registros
    public List<Persona> findAll(){
        return personaRepository.findAll();
    }

    //Buscar registro por ID de Persona
    public Optional<Persona> findById(String id){
        return personaRepository.findById(id);
    }

    //Eliminar registro por ID de Persona
    public void deleteById(String id){
        personaRepository.deleteById(id);
    }
}
