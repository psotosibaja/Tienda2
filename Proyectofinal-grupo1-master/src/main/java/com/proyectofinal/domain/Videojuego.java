package com.proyectofinal.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="videojuego")
public class Videojuego implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_videojuego")
    private Long idVideojuego;
    
    private String genero;
    private boolean aplica;

    public Videojuego() {
    }

    public Videojuego(String genero, boolean aplica) {
        this.genero = genero;
        this.aplica = aplica;
    }
    
    
}
