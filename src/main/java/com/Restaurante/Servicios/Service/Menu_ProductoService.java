

  package com.Restaurante.Servicios.Service;
import com.Restaurante.Servicios.Models.Menu_Producto;
import java.util.List;

public interface Menu_ProductoService {
    public Menu_Producto save(Menu_Producto menu_producto);
    public void delete(int id);
    public Menu_Producto findById(int id);
    public List<Menu_Producto> findByAll();
}
  