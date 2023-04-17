package com.backendsample.backendspringboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class controladorInicio {
    @GetMapping("/")
        public String inicio() {
            log.info("Ejecutando el controlador REST");
            log.debug("mas detalle del controlador");
            return "Hola Mundo con Spring";
        }
}
