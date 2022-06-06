package com.crud.mongodb.service;

import com.crud.mongodb.kafka.SaludoStreams;
import com.crud.mongodb.model.Saludos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SaludosListener {
    @StreamListener(SaludoStreams.INPUT)
    public void manejarSaludos(@Payload final Saludos saludos) {
        log.info("Recibimos Saludos: {}", saludos);
    }
}
