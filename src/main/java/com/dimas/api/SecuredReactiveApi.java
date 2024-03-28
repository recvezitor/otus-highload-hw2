package com.dimas.api;

import com.dimas.api.model.ApiLoginPost200Response;
import com.dimas.api.model.ApiLoginPostRequest;
import com.dimas.api.model.ApiUser;
import com.dimas.api.model.ApiUserRegisterPost200Response;
import com.dimas.api.model.ApiUserRegisterPostRequest;
import com.dimas.controller.filter.Secured;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

import java.util.List;


@Path("")
@ApplicationScoped
public interface SecuredReactiveApi {

    /**
     * Упрощенный процесс аутентификации путем передачи идентификатор пользователя и получения токена для дальнейшего прохождения авторизации
     *
     * @param apiLoginPostRequest
     */
    @POST
    @Path("/login")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Uni<ApiLoginPost200Response> loginPost(ApiLoginPostRequest apiLoginPostRequest);

    /**
     * Получение анкеты пользователя
     *
     * @param id Идентификатор пользователя
     */
    @GET
    @Path("/user/get/{id}")
    @Produces({"application/json"})
    @Secured
    Uni<ApiUser> userGetIdGet(@PathParam("id") String id);


    /**
     * Получение количества пользователей в одном городе. Для проверки индексов на равенство
     *
     * @param city название города
     */
    @GET
    @Path("/user/city/{city}")
    @Produces({"application/json"})
    @Secured
    Uni<Integer> userFromCity(@PathParam("city") String city);

    /**
     * Регистрация нового пользователя
     *
     * @param apiUserRegisterPostRequest
     */
    @POST
    @Path("/user/register")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Uni<ApiUserRegisterPost200Response> userRegisterPost(ApiUserRegisterPostRequest apiUserRegisterPostRequest);

    /**
     * Поиск анкет
     *
     * @param firstName Условие поиска по имени
     * @param lastName  Условие поиска по фамилии
     */
    @GET
    @Path("/user/search")
    @Produces({"application/json"})
    @Secured
    Uni<List<ApiUser>> userSearchGet(
            @QueryParam("first_name") String firstName,
            @QueryParam("last_name") String lastName
    );


}
