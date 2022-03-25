
package com.proyectofinal.service;

import com.proyectofinal.dao.ProductoDao;
import com.proyectofinal.dao.PerifericoDao;
import com.proyectofinal.domain.Producto;
import com.proyectofinal.domain.Periferico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerifericoServiceimpl implements PerifericoService{
    @Autowired
    private PerifericoDao perifericoDao;
    
    @Autowired
    private ProductoDao productoDao;
    
    @Override
    public List<Periferico> getPerifericos() {
        return (List<Periferico>)perifericoDao.findAll();
        
    }

    @Override
    public void save(Periferico periferico) {
        Producto producto = periferico.getProducto();
        producto = productoDao.save(producto);
        periferico.setProducto(producto);
        perifericoDao.save(periferico);
    }

    @Override
    public void delete(Periferico periferico) {
        perifericoDao.delete(periferico);
    }

    @Override
    public Periferico getPeriferico(Periferico periferico) {
        return perifericoDao.findById(periferico.getIdPeriferico()).orElse(null);
    }
    
}
