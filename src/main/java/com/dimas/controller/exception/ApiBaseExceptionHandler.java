package com.dimas.controller.exception;

import com.dimas.exception.ApiBaseException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Provider
@RequiredArgsConstructor
public class ApiBaseExceptionHandler implements ExceptionMapper<ApiBaseException> {

    @Override
    public Response toResponse(ApiBaseException exception) {
        return Response.status(400).entity(exception.getMessage() + "Api").build();
    }

}