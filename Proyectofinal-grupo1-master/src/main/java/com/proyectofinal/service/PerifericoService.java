
package com.proyectofinal.service;

import com.proyectofinal.domain.Periferico;
import java.util.List;

public interface PerifericoService {
    public List<Periferico> getPerifericos();
    
    public void save(Periferico periferico);
    
    public void delete(Periferico periferico);
    
    public Periferico getPeriferico(Periferico periferico);
}
