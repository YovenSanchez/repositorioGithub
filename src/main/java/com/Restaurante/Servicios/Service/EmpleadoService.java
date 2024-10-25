
package com.Restaurante.Servicios.Service;
import com.Restaurante.Servicios.Models.Empleado;
import java.util.List;

public interface EmpleadoService{
    
    public Empleado save(Empleado empleado);
    public void delete(int id);
    public Empleado findById(int id);
    public List<Empleado> findByAll();
    
}
