
package com.Restaurante.Servicios.Service.Implement;

import com.Restaurante.Servicios.Models.Pedido;
import com.Restaurante.Servicios.Dao.PedidoDao;
import com.Restaurante.Servicios.Service.PedidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService{
    @Autowired
    private PedidoDao pedidoDao;
    @Override
    @Transactional(readOnly=false)
    public Pedido save(Pedido pedido) {
        return pedidoDao.save(pedido);
    }
    @Override
    @Transactional(readOnly=false)
    public void delete(int id) {
        pedidoDao.deleteById(id);
    }
    @Override
    @Transactional(readOnly=true)
    public Pedido findById(int id) {
        return pedidoDao.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly=true)
    public List<Pedido> findByAll() {
        return (List<Pedido>) pedidoDao.findAll();
    }
      
}

