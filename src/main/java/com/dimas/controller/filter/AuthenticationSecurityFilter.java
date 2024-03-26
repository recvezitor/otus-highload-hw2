package com.dimas.controller.filter;


import com.dimas.service.AuthService;
import io.quarkus.security.AuthenticationFailedException;
import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;
import lombok.extern.slf4j.Slf4j;
import org.jboss.resteasy.reactive.server.spi.ResteasyReactiveContainerRequestContext;
import org.jboss.resteasy.reactive.server.spi.ResteasyReactiveContainerRequestFilter;

@Secured
@Slf4j
@Provider
@Priority(Priorities.AUTHENTICATION)
public class AuthenticationSecurityFilter implements ResteasyReactiveContainerRequestFilter {
    private static final String REALM = "example";
    private static final String AUTHENTICATION_SCHEME = "Bearer";
    @Inject
    AuthService authService;

    @Override
    public void filter(ResteasyReactiveContainerRequestContext requestContext) {
        String authorizationHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);//TODO add security context
        if (!isTokenBasedAuthentication(authorizationHeader)) {
            abortWithUnauthorized(requestContext);
            return;
        }
        String token = authorizationHeader.substring(AUTHENTICATION_SCHEME.length()).trim();
        try {
            validateToken(token);
        } catch (Exception e) {
            abortWithUnauthorized(requestContext, e);
        }
    }

    private boolean isTokenBasedAuthentication(String authorizationHeader) {
        return authorizationHeader != null && authorizationHeader.toLowerCase()
                .startsWith(AUTHENTICATION_SCHEME.toLowerCase() + " ");
    }

    private void abortWithUnauthorized(ContainerRequestContext requestContext) {
        abortWithUnauthorized(requestContext, null);
    }

    private void abortWithUnauthorized(ContainerRequestContext requestContext, Exception ex) {
        requestContext.abortWith(
                Response.status(Response.Status.UNAUTHORIZED)
                        .header(HttpHeaders.WWW_AUTHENTICATE,
                                AUTHENTICATION_SCHEME + " realm=\"" + REALM + "\"")
                        .entity(ex == null ? null : ex.getMessage())
                        .build());
    }

    private void validateToken(String token) throws Exception {
        if (!authService.isValid(token)) throw new AuthenticationFailedException("Invalid token");
    }

}
