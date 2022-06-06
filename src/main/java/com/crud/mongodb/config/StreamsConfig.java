package com.crud.mongodb.config;

import com.crud.mongodb.kafka.SaludoStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(SaludoStreams.class)
public class StreamsConfig {

}
