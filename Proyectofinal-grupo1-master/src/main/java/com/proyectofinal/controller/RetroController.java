
package com.proyectofinal.controller;

import com.proyectofinal.domain.Retro;
import com.proyectofinal.service.RetroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class RetroController {
        @Autowired
    private RetroService retroService;
    
    @GetMapping("/retro/principal")
    public String inicio(Model model){       
        var retros = retroService.getRetros();
        model.addAttribute("retros",retros);
        return "/retro/principal";
    }
     @GetMapping("/retro/nuevo")
    public String nuevoRetro(Retro retro){       
        return "/retro/modificar";
    }
    
     @PostMapping("/retro/guardar")
    public String guardarRetro(Retro retro){
        retroService.save(retro);
        return "redirect:/retro/listado";
    }
    
     @GetMapping("/retro/modificar/{idRetro}")
    public String modificarRetro(Retro retro, Model model){
        retro = retroService.getRetro(retro);
        model.addAttribute("retro",retro);
        return "/retro/modificar";
    }
    
     @GetMapping("/retro/eliminar/{idRetro}")
    public String eliminarRetro(Retro retro){
        retroService.delete(retro);
        return "redirect:/retro/listado";
    }
}
