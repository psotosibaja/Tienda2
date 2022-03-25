
package com.proyectofinal.service;

import com.proyectofinal.dao.ProductoDao;
import com.proyectofinal.dao.RetroDao;
import com.proyectofinal.dao.VideojuegoDao;
import com.proyectofinal.domain.Producto;
import com.proyectofinal.domain.Retro;
import com.proyectofinal.domain.Videojuego;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetroServiceimpl implements RetroService{
    @Autowired
    private RetroDao retroDao;
    
    @Autowired
    private ProductoDao productoDao;
    
    @Autowired
    private VideojuegoDao videojuegoDao;

    @Override
    public List<Retro> getRetros() {
        return (List<Retro>)retroDao.findAll();
        
    }

    @Override
    public void save(Retro retro) {
        Producto producto = retro.getProducto();
        producto = productoDao.save(producto);
        retro.setProducto(producto);
        Videojuego videojuego = retro.getVideojuego();
        videojuego = videojuegoDao.save(videojuego);
        retro.setVideojuego(videojuego);
        retroDao.save(retro);
    }

    @Override
    public void delete(Retro retro) {
        retroDao.delete(retro);
    }

    @Override
    public Retro getRetro(Retro retro) {
        return retroDao.findById(retro.getIdRetro()).orElse(null);
    }
    
}
