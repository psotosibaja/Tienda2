
package com.proyectofinal.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="infantil")
public class Infantil implements Serializable{
   private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInfantil;
    
    private String nombre;
    private double precio;
    private String edadrecomendada;
    private String descripcion;
    
    @JoinColumn(name="id_producto", referencedColumnName = "id_producto")
    @ManyToOne
    private Producto producto;
    
    @JoinColumn(name="id_videojuego", referencedColumnName = "id_videojuego")
    @ManyToOne
    private Videojuego videojuego;

    public Infantil() {
    }

    public Infantil(String nombre, double precio, String edadrecomendada, String estado, String descripcion, Producto producto, Videojuego videojuego) {
        this.nombre = nombre;
        this.precio = precio;
        this.edadrecomendada = edadrecomendada;
        this.descripcion = descripcion;
        this.producto = producto;
        this.videojuego = videojuego;
    }
    
    
}
