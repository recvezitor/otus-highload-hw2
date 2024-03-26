package com.dimas.controller;

import com.dimas.domain.mapper.PersonMapper;
import com.dimas.log.LogRequest;
import com.dimas.openapi.model.ApiLoginPost200Response;
import com.dimas.openapi.model.ApiLoginPostRequest;
import com.dimas.openapi.model.ApiUser;
import com.dimas.openapi.model.ApiUserRegisterPost200Response;
import com.dimas.openapi.model.ApiUserRegisterPostRequest;
import com.dimas.service.PersonService;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.UUID;

@Slf4j
@ApplicationScoped
@RequiredArgsConstructor
@LogRequest
public class OpenApiController implements SecuredReactiveApi {

    private final PersonService personService;
    private final PersonMapper personMapper;

    @Override
    public Uni<ApiLoginPost200Response> loginPost(ApiLoginPostRequest apiLoginPostRequest) {
        return personService.login(UUID.fromString(apiLoginPostRequest.getId()), apiLoginPostRequest.getPassword())
                .map(response -> new ApiLoginPost200Response().token(response));
    }

    @Override
    public Uni<ApiUser> userGetIdGet(String id) {
        return personService.findById(UUID.fromString(id))
                .map(personMapper::map);
    }

    @Override
    public Uni<ApiUserRegisterPost200Response> userRegisterPost(ApiUserRegisterPostRequest apiUserRegisterPostRequest) {
        var request = personMapper.map(apiUserRegisterPostRequest);
        return personService.create(request)
                .map(person -> new ApiUserRegisterPost200Response().userId(person.getId().toString()));
    }

    @Override
    public Uni<List<ApiUser>> userSearchGet(String firstName, String lastName) {
        return personService.search(firstName, lastName);
    }

}
