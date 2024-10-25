
package com.Restaurante.Servicios.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Entity(name="cliente")
public class Cliente implements Serializable {
     @Id
    @Column(name="id")
    private int id_cliente;
    @Column(name="Nombre")
    private String nombre_cliente;
    @Column(name="Telefono")
    private int telefono;
    @Column(name="Edad")
    private int edad;
    @Column(name="Correo_electronico")
    private String correo_electronico;
    @Column(name="Direccion")
    private String direccion;


    public Cliente() {
    }

    public Cliente(int id_cliente,String nombre_cliente,int telefono,int edad, String correo_electronico, String direccion) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.telefono = telefono;        
        this.edad = edad;
        this.correo_electronico = correo_electronico;
        this.direccion = direccion;   
    }
    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
   public String getNombre_cliente() {
        return nombre_cliente;
    }
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }   
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
   public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
      public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
         public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
  
    
}
   