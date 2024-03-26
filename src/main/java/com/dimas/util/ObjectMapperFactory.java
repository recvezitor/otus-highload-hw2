package com.dimas.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import static java.util.Objects.isNull;

public class ObjectMapperFactory {

    public static ObjectMapper createObjectMapper() {
        return createObjectMapper(null);
    }

    public static ObjectMapper createObjectMapper(ObjectMapper objectMapper) {
        return (!isNull(objectMapper) ? objectMapper : new ObjectMapper())
                .registerModule(new JavaTimeModule())
                .enable(
                        DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE,
                        DeserializationFeature.READ_ENUMS_USING_TO_STRING,
                        DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,
                        DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,
                        DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT
                )
                .enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)
                .enable(JsonReadFeature.ALLOW_TRAILING_COMMA.mappedFeature())
                .disable(
                        SerializationFeature.FAIL_ON_EMPTY_BEANS,
                        SerializationFeature.WRITE_DATES_AS_TIMESTAMPS
                )
                .configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .setPropertyNamingStrategy(PropertyNamingStrategies.LOWER_CAMEL_CASE);
    }

}
