
  package com.Restaurante.Servicios.Service;
import com.Restaurante.Servicios.Models.Producto;
import java.util.List;

public interface ProductoService {
    public Producto save(Producto producto);
    public void delete(int id);
    public Producto findById(int id);
    public List<Producto> findByAll();
}
