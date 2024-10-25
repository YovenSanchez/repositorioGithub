

  package com.Restaurante.Servicios.Service;
import com.Restaurante.Servicios.Models.Menu;
import java.util.List;

public interface MenuService {
    public Menu save(Menu menu);
    public void delete(int id);
    public Menu findById(int id);
    public List<Menu> findByAll();
}
  