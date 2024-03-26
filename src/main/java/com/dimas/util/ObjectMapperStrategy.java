package com.dimas.util;

import jakarta.enterprise.util.Nonbinding;
import jakarta.inject.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD, PARAMETER, TYPE, METHOD})
@Qualifier
public @interface ObjectMapperStrategy {
    ObjectMapperType value() default  ObjectMapperType.CAMEL;

    // Поля помеченные аннотацией @Nonbinding при выборе реализации учитываться не будут
    @Nonbinding String desc() default "";
}