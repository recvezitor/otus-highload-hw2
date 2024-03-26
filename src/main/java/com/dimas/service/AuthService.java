package com.dimas.service;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Objects.isNull;
import static java.util.Objects.requireNonNull;

@Slf4j
@RequiredArgsConstructor
@ApplicationScoped
public class AuthService {

    private final Map<UUID, String> storage = new ConcurrentHashMap<>();

    public boolean isValid(String token) {
        return !isNull(token) && storage.containsValue(token);
    }

    public Uni<Void> save(UUID id, String token) {
        requireNonNull(id, "id cannot be null");
        requireNonNull(token, "token cannot be null");
        storage.put(id, token);
        return Uni.createFrom().voidItem();
    }

}
