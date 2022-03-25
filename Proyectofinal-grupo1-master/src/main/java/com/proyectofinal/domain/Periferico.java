
package com.proyectofinal.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="periferico")
public class Periferico implements Serializable{
   private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPeriferico;
    
    private String nombre;
    private double precio;
    private String caracteristicas;
    private String marca;
    private String descripcion;
    
    @JoinColumn(name="id_producto", referencedColumnName = "id_producto")
    @ManyToOne
    private Producto producto;

    public Periferico() {
    }

    public Periferico(String nombre, double precio, String caracteristicas, String marca, String estado, String descripcion, Producto producto) {
        this.nombre = nombre;
        this.precio = precio;
        this.caracteristicas = caracteristicas;
        this.marca = marca;
        this.descripcion = descripcion;
        this.producto = producto;
        
    }
    
    
}
