package com.dimas.log;

import io.vertx.core.http.HttpServerRequest;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import static com.dimas.util.Util.isEnabledByProperty;
import static java.util.Objects.isNull;

@Slf4j
@Interceptor
@LogRequest
public class LogRequestInterceptor {

    @Inject
    HttpServerRequest currentRequest;

    @AroundInvoke
    public Object logContext(InvocationContext context) {
        doLog(context);
        return getProceed(context);
    }

    private void doLog(InvocationContext context) {
        if (!isNull(currentRequest) && isEnabledByProperty("rest-logging.enabled")) {
            log.debug("{} {}", currentRequest.method(), currentRequest.absoluteURI());
            for (var entry : currentRequest.headers()) {
                log.debug("[{}]:{}", entry.getKey(), entry.getValue());
            }
            log.debug("Request args: {}", context.getParameters());
        }
    }

    @SneakyThrows
    private Object getProceed(InvocationContext context) {
        return context.proceed();
    }

}

