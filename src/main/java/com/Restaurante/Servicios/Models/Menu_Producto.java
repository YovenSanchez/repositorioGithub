
package com.Restaurante.Servicios.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity(name="Menu_Producto")
public class Menu_Producto implements Serializable {
     @Id
    @Column(name="id")
    private int id_menu_producto;
@ManyToOne
    @JoinColumn(name = "id_Menu")
    private Menu menu;
@ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    public Menu_Producto() {
    }

    public Menu_Producto(int id_menu_producto, Menu menu, Producto producto) {
        this.id_menu_producto = id_menu_producto;
        this.menu = menu;
        this.producto = producto;
    }

    public int getId_menu_producto() {
        return id_menu_producto;
    }

    public void setId_menu_producto(int id_menu_producto) {
        this.id_menu_producto = id_menu_producto;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }



}
