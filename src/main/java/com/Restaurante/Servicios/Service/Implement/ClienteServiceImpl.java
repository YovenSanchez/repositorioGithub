
package com.Restaurante.Servicios.Service.Implement;

import com.Restaurante.Servicios.Models.Cliente;
import com.Restaurante.Servicios.Dao.ClienteDao;
import com.Restaurante.Servicios.Service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
  @Autowired
    private ClienteDao clienteDao;
    @Override
    @Transactional(readOnly=false)
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }
    @Override
    @Transactional(readOnly=false)
    public void delete(int id) {
        clienteDao.deleteById(id);
    }
    @Override
    @Transactional(readOnly=true)
    public Cliente findById(int id) {
        return clienteDao.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly=true)
    public List<Cliente> findByAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
      
}
