package com.dimas.controller.filter;

import io.vertx.core.http.HttpServerRequest;
import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.container.ContainerRequestContext;
import lombok.extern.slf4j.Slf4j;
import org.jboss.resteasy.reactive.server.ServerRequestFilter;

import static com.dimas.util.Util.isEnabledByProperty;
import static java.util.Objects.isNull;

@Slf4j
public class LogServerRequestFilter {

    @ServerRequestFilter(priority = Priorities.USER)
    public void logFilter(HttpServerRequest request, ContainerRequestContext ctx) {
        if (!isNull(request) && isEnabledByProperty("rest-logging.enabled")) {
            doLog(request);
        }
    }

    private void doLog(HttpServerRequest request) {
        StringBuilder builder = new StringBuilder("\n[%s]: %s\n".formatted(request.method(), request.absoluteURI()));
        for (var entry : request.headers()) {
            builder.append("[%s]: %s\n".formatted(entry.getKey(), entry.getValue()));
        }
        if (isEnabledByProperty("rest-logging.append-body")) {
            request.body(buffer -> {
                builder.append("[Body]: %s".formatted(buffer.result()));
                log.debug(builder.toString());
            });
        } else {
            log.debug(builder.toString());
        }
    }

}