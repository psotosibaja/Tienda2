
package com.proyectofinal.service;

import com.proyectofinal.dao.ProductoDao;
import com.proyectofinal.dao.InfantilDao;
import com.proyectofinal.dao.VideojuegoDao;
import com.proyectofinal.domain.Producto;
import com.proyectofinal.domain.Infantil;
import com.proyectofinal.domain.Videojuego;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfantilServiceimpl implements InfantilService{
    @Autowired
    private InfantilDao infantilDao;
    
    @Autowired
    private ProductoDao productoDao;
    
    @Autowired
    private VideojuegoDao videojuegoDao;

    @Override
    public List<Infantil> getInfantils() {
        return (List<Infantil>)infantilDao.findAll();
        
    }

    @Override
    public void save(Infantil infantil) {
        Producto producto = infantil.getProducto();
        producto = productoDao.save(producto);
        infantil.setProducto(producto);
        Videojuego videojuego = infantil.getVideojuego();
        videojuego = videojuegoDao.save(videojuego);
        infantil.setVideojuego(videojuego);
        infantilDao.save(infantil);
    }

    @Override
    public void delete(Infantil infantil) {
        infantilDao.delete(infantil);
    }

    @Override
    public Infantil getInfantil(Infantil infantil) {
        return infantilDao.findById(infantil.getIdInfantil()).orElse(null);
    }
    
}
