package com.crud.mongodb.service;

import com.crud.mongodb.kafka.SaludoStreams;
import com.crud.mongodb.model.Saludos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class SaludoService {
  private final SaludoStreams saludoStreams;

  public SaludoService(final SaludoStreams saludoStreams) {
    this.saludoStreams = saludoStreams;
  }

    public void sendGreeting(final Saludos saludos) {

        log.info("Enviando saludos {}", saludos);
        final MessageChannel messageChannel = saludoStreams.saludoSaliente();
        messageChannel.send(MessageBuilder
                .withPayload(saludos)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}