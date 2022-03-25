
package com.proyectofinal.controller;

import com.proyectofinal.domain.Periferico;
import com.proyectofinal.service.PerifericoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class PerifericoController {
        @Autowired
    private PerifericoService perifericoService;
    
    @GetMapping("/periferico/principal")
    public String inicio(Model model){       
        var perifericos = perifericoService.getPerifericos();
        model.addAttribute("perifericos",perifericos);
        return "/periferico/principal";
    }
     @GetMapping("/periferico/nuevo")
    public String nuevoPeriferico(Periferico periferico){       
        return "/periferico/modificar";
    }
    
     @PostMapping("/periferico/guardar")
    public String guardarPeriferico(Periferico periferico){
        perifericoService.save(periferico);
        return "redirect:/periferico/listado";
    }
    
     @GetMapping("/periferico/modificar/{idPeriferico}")
    public String modificarPeriferico(Periferico periferico, Model model){
        periferico = perifericoService.getPeriferico(periferico);
        model.addAttribute("periferico",periferico);
        return "/periferico/modificar";
    }
    
     @GetMapping("/periferico/eliminar/{idPeriferico}")
    public String eliminarPeriferico(Periferico periferico){
        perifericoService.delete(periferico);
        return "redirect:/periferico/listado";
    }
}
