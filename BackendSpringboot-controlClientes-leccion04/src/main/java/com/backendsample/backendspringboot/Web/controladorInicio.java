package com.backendsample.backendspringboot.Web;


import com.backendsample.backendspringboot.Servicios.IPersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
@Slf4j
public class controladorInicio {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/")
        public String inicio(Model model) {
            var personas = personaService.listarPersonas();

            log.info("Ejecutando el controlador Spring MVC");

            model.addAttribute("personas", personas);
            return "index";
        }
}
