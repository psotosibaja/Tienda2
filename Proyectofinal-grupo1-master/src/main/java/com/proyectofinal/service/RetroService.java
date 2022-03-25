
package com.proyectofinal.service;

import com.proyectofinal.domain.Retro;
import java.util.List;

public interface RetroService {
    public List<Retro> getRetros();
    
    public void save(Retro retro);
    
    public void delete(Retro retro);
    
    public Retro getRetro(Retro retro);
}
