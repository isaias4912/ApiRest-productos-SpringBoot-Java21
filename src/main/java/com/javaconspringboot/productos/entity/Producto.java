package com.javaconspringboot.productos.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
//table nos permite dar nombre a la bdd distinto a la clase y en plural
//entity nos dice qu esta clase va a ser una entidad de base de datos
@Entity
@Table(name="productos")
public class Producto {
    // @id nos indica q la variable id va a ser un dato de clase primaria
    //gerenerate value nos permite definir la estrategia de llenado de esta app y el llenado se hace de manera autom y secuencial
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String nombre;
    private String detalle;
    private BigDecimal precio;
    @CreationTimestamp //lo que hace es cuando se inserta un registro pone la fecha actual
    private LocalDateTime fechaCraedo;
    @UpdateTimestamp //lo que  hace cuando detecta una actualizacion aplica la mismaactualizacion de la fecha
    private LocalDateTime fechaActualizado;

    //se declara un constructor vacio y se crea los metodos geters y setters
    public Producto(){

    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public LocalDateTime getFechaActualizado() {
        return fechaActualizado;
    }

    public void setFechaActualizado(LocalDateTime fechaActualizado) {
        this.fechaActualizado = fechaActualizado;
    }

    public LocalDateTime getFechaCraedo() {
        return fechaCraedo;
    }

    public void setFechaCraedo(LocalDateTime fechaCraedo) {
        this.fechaCraedo = fechaCraedo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
