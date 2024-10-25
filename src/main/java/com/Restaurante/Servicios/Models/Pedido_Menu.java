
package com.Restaurante.Servicios.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity(name="Pedido_Menu")
public class Pedido_Menu implements Serializable {
     @Id
    @Column(name="id")
    private int id_pedido_menu;
@ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;
@ManyToOne
    @JoinColumn(name = "id_Menu")
    private Menu menu;
    @Column(name="Cantidad")
    private int cantidad;
        @Column(name="ValorTotal")
    private int valortotal;
    public Pedido_Menu() {
    }

    public Pedido_Menu(int id_pedido_menu, Pedido pedido, Menu menu, int cantidad, int valortotal) {
        this.id_pedido_menu = id_pedido_menu;
        this.pedido = pedido;
        this.menu = menu;
        this.cantidad = cantidad;
        this.valortotal = valortotal;
    }

 
    
    public int getId_pedido_menu() {
        return id_pedido_menu;
    }

    public void setId_pedido_menu(int id_pedido_menu) {
        this.id_pedido_menu = id_pedido_menu;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValortotal() {
        return valortotal;
    }

    public void setValortotal(int valortotal) {
        this.valortotal = valortotal;
    }

}