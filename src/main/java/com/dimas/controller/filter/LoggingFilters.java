package com.dimas.controller.filter;

import jakarta.annotation.Priority;
import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.ext.Provider;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.jboss.resteasy.reactive.server.spi.ResteasyReactiveContainerRequestContext;
import org.jboss.resteasy.reactive.server.spi.ResteasyReactiveContainerRequestFilter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static com.dimas.util.Util.isEnabledByProperty;
import static java.util.Objects.isNull;


@LogFilterRequest
@Slf4j
@Provider
@Priority(Priorities.AUTHENTICATION - 1)
public class LoggingFilters implements ResteasyReactiveContainerRequestFilter {

    @Override
    public void filter(ResteasyReactiveContainerRequestContext requestContext) {
        log.info("LoggingFilters");
        if (!isNull(requestContext) && isEnabledByProperty("rest-logging.enabled")) {
            doLog(requestContext);
        }
    }

    private void doLog(ResteasyReactiveContainerRequestContext requestContext) {
        StringBuilder builder = new StringBuilder("\n[%s]: %s\n".formatted(requestContext.getMethod(), requestContext.getUriInfo().getAbsolutePath()));
        for (var entry : requestContext.getHeaders().entrySet()) {
            builder.append("[%s]: %s\n".formatted(entry.getKey(), entry.getValue()));
        }
        if (isEnabledByProperty("rest-logging.append-body")) {
            try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                IOUtils.copy(requestContext.getEntityStream(), baos);
                byte[] bytes = baos.toByteArray();
                builder.append("[Body]: %s".formatted(bytes.length == 0 ? "<empty>" : new String(bytes, StandardCharsets.UTF_8)));
                log.info(builder.toString());
                requestContext.setEntityStream(new ByteArrayInputStream(bytes));
            } catch (IOException ex) {
                log.error("Failed to log request body", ex);
            }
        } else {
            log.info(builder.toString());
        }
    }

}