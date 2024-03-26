package com.dimas.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import io.quarkus.jackson.ObjectMapperCustomizer;
import jakarta.inject.Singleton;

import static com.dimas.util.ObjectMapperFactory.createObjectMapper;

@Singleton
public class RegisterObjectMapperCustomizer implements ObjectMapperCustomizer {

    public void customize(ObjectMapper mapper) {
        createObjectMapper(mapper).
                setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
    }

}