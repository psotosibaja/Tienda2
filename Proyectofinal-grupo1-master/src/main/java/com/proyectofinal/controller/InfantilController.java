
package com.proyectofinal.controller;

import com.proyectofinal.domain.Infantil;
import com.proyectofinal.service.InfantilService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class InfantilController {
        @Autowired
    private InfantilService infantilService;
    
    @GetMapping("/infantil/principal")
    public String inicio(Model model){       
        var infantils = infantilService.getInfantils();
        model.addAttribute("infantils",infantils);
        return "/infantil/principal";
    }
     @GetMapping("/infantil/nuevo")
    public String nuevoInfantil(Infantil infantil){       
        return "/infantil/modificar";
    }
    
     @PostMapping("/infantil/guardar")
    public String guardarInfantil(Infantil infantil){
        infantilService.save(infantil);
        return "redirect:/infantil/listado";
    }
    
     @GetMapping("/infantil/modificar/{idInfantil}")
    public String modificarInfantil(Infantil infantil, Model model){
        infantil = infantilService.getInfantil(infantil);
        model.addAttribute("infantil",infantil);
        return "/infantil/modificar";
    }
    
     @GetMapping("/infantil/eliminar/{idInfantil}")
    public String eliminarInfantil(Infantil infantil){
        infantilService.delete(infantil);
        return "redirect:/infantil/listado";
    }
}
