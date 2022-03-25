
package com.proyectofinal.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="retro")
public class Retro implements Serializable{
   private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRetro;
    
    private String nombre;
    private double precio;
    private String anodesalida;
    private String estado;
    private String descripcion;
    
    @JoinColumn(name="id_producto", referencedColumnName = "id_producto")
    @ManyToOne
    private Producto producto;
    
    @JoinColumn(name="id_videojuego", referencedColumnName = "id_videojuego")
    @ManyToOne
    private Videojuego videojuego;

    public Retro() {
    }

    public Retro(String nombre, double precio, String anodesalida, String estado, String descripcion, Producto producto, Videojuego videojuego) {
        this.nombre = nombre;
        this.precio = precio;
        this.anodesalida = anodesalida;
        this.estado = estado;
        this.descripcion = descripcion;
        this.producto = producto;
        this.videojuego = videojuego;
    }
    
    
}
