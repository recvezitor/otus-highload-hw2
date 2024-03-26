package com.dimas.service;

import com.dimas.domain.PersonCreate;
import com.dimas.domain.entity.Person;
import com.dimas.domain.mapper.PersonMapper;
import com.dimas.openapi.model.ApiUser;
import com.dimas.persistence.PersonRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ForbiddenException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.UUID;

import static com.dimas.util.SecurityUtil.encrypt;
import static com.dimas.util.SecurityUtil.validPassword;

@Slf4j
@ApplicationScoped
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;
    private final TokenService tokenService;
    private final AuthService authService;

    public Uni<Person> findById(UUID id) {
        return personRepository.getById(id);
    }

    public Uni<String> login(UUID id, String password) {
        return personRepository.getById(id)
                .flatMap(person -> handleToken(person, password));
    }

    private Uni<String> handleToken(Person person, String password) {
        log.info("Person is found={}", person);
        if (!validPassword(person.getPassword(), password)) {
            return Uni.createFrom().failure(new ForbiddenException("Неверный логин или пароль"));
        }
        return tokenService.generate(person.getId(), null)
                .onItem().call(token -> authService.save(person.getId(), token));
    }

    public Uni<Person> findByName(String name) {
        return personRepository.getByName(name);
    }

    public Uni<Person> create(PersonCreate request) {
        var person = personMapper.map(request)
                .withPassword(encrypt(request.getPassword()));
        return personRepository.create(person);
    }

    public Uni<List<ApiUser>> search(String firstName, String lastName) {
        return personRepository.search(firstName, lastName)
                .map(list -> list.stream().map(personMapper::map).toList());
    }


}
