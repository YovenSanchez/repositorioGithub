
package com.Restaurante.Servicios.Service;

import com.Restaurante.Servicios.Models.Cliente;
import java.util.List;

public interface ClienteService {
    public Cliente save(Cliente cliente);
    public void delete(int id);
    public Cliente findById(int id);
    public List<Cliente> findByAll();
    
}
