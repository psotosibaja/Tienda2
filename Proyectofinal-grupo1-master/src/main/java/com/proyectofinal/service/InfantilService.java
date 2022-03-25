
package com.proyectofinal.service;

import com.proyectofinal.domain.Infantil;
import java.util.List;

public interface InfantilService {
    public List<Infantil> getInfantils();
    
    public void save(Infantil infantil);
    
    public void delete(Infantil infantil);
    
    public Infantil getInfantil(Infantil infantil);
}
