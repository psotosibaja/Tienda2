
package com.proyectofinal.dao;

import com.proyectofinal.domain.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto,Long>{
    
}
