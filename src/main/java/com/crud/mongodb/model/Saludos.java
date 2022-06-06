package com.crud.mongodb.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Saludos {
    private long timestamp;
    private String message;
}
