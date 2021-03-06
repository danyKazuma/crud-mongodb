package com.crud.mongodb.web;

import com.crud.mongodb.model.Saludos;
import com.crud.mongodb.service.SaludoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludosController {
    private final SaludoService saludoService;

    public SaludosController(final SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/saludos")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("message") final String message) {

        final Saludos saludos = Saludos.builder()
                .message(message)
                .timestamp(System.currentTimeMillis())
                .build();

        saludoService.sendGreeting(saludos);

    }
}
