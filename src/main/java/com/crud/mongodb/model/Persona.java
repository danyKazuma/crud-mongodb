package com.crud.mongodb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(value="/cliente")
public class Persona {
    @Id
    private String id;
    private String nombres;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private int edad;
    private String direccion;
    private String distrito;
    private String telefono;
    private String documentType;
    private String documentNumber;
    private String estado;
    private boolean enable;

}
