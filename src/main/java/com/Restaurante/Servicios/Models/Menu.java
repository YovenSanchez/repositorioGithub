
package com.Restaurante.Servicios.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Table
@Entity(name="Menu")
public class Menu implements Serializable {
     @Id
    @Column(name="id")
    private int id_menu;
    @Column(name="Nombre")
    private String nombre;
    @Column(name="Descripcion")
    private int descripcion;
    @Column(name="Precio")
    private int precio;
    @Column(name="Disponibilidad")
    private String disponibilidad;

    public Menu() {
    }

    public Menu(int id_menu, String nombre, int descripcion, int precio, String disponibilidad) {
        this.id_menu = id_menu;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
