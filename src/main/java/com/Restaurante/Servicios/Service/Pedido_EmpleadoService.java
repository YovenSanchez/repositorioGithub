

  package com.Restaurante.Servicios.Service;
import com.Restaurante.Servicios.Models.Pedido_Empleado;
import java.util.List;

public interface Pedido_EmpleadoService {
    public Pedido_Empleado save(Pedido_Empleado pedido_empleado);
    public void delete(int id);
    public Pedido_Empleado findById(int id);
    public List<Pedido_Empleado> findByAll();
}
  