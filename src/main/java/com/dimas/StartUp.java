package com.dimas;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StartUp {

    void onStart(@Observes StartupEvent event) {
        log.info("Started INFO");
        log.debug("Started DEBUG");
        log.warn("Started WARN");
        log.error("Started ERROR");
        log.trace("Started TRACE");
    }

}
