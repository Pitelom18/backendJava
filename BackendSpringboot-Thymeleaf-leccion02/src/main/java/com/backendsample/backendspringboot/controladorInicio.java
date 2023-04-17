package com.backendsample.backendspringboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;


@Controller
@Slf4j
public class controladorInicio {
    @Value ("${index.saludo}")
    private String saludo;
    @GetMapping("/")
        public String inicio(Model model) {
            var mensaje = "Hola Mundo con Thymeleaf";

            var persona1 = new Persona();
            persona1.setNombre("Juan");
            persona1.setApellido("Perez");
            persona1.setEmail("jperez@mail.com");
            persona1.setTelefono("123456789");

        var persona2= new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("kgomez@mail.com");
        persona2.setTelefono("1233298");

        // var  personas = new ArrayList<>();
        //personas.add(persona);
        //personas.add(persona2);

        var personas = Arrays.asList(persona1, persona2);

            log.info("Ejecutando el controlador Spring MVC");
            model.addAttribute("mensaje", mensaje);
            model.addAttribute("saludo", saludo);
            //model.addAttribute("persona", persona);
            model.addAttribute("personas", personas);
            return "index";
        }
}
