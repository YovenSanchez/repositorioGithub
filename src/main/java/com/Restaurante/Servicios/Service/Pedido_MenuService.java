
  package com.Restaurante.Servicios.Service;
import com.Restaurante.Servicios.Models.Pedido_Menu;
import java.util.List;
public interface Pedido_MenuService {
    public Pedido_Menu save(Pedido_Menu pedido_menu);
    public void delete(int id);
    public Pedido_Menu findById(int id);
    public List<Pedido_Menu> findByAll();
        public List<Pedido_Menu> consultarPedido(Integer idp);
}

