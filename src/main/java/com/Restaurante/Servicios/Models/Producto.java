
package com.Restaurante.Servicios.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table
@Entity(name="Producto")
public class Producto implements Serializable {
     @Id
    @Column(name="id")
    private int id_producto;
    @Column(name="Nombre")
    private String nombre;
    @Column(name="Descripcion")
    private String descripcion;
    @Column(name="Precio")
    private int precio;

    public Producto() {
    }

    public Producto(int id_producto, String nombre, String descripcion, int precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
