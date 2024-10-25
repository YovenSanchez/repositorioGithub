
package com.Restaurante.Servicios.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name="Empleado")
public class Empleado implements java.io.Serializable {
     @Id
    @Column(name="id")
    private int id_empleado;
    @Column(name="Nombre")
    private String nombre;

    public Empleado() {
    }
    public Empleado(int id_empleado, String nombre) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
