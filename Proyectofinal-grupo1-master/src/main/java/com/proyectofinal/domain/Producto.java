
package com.proyectofinal.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long idProducto;
    
    private String tipogarantia;
    private boolean garantia;

    public Producto() {
    }

    public Producto(String tipogarantia, boolean garantia) {
        this.tipogarantia = tipogarantia;
        this.garantia = garantia;
    }
    
    
    
}
