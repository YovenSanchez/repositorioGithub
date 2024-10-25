
package com.Restaurante.Servicios.Service.Implement;

import com.Restaurante.Servicios.Models.Pedido_Menu;
import com.Restaurante.Servicios.Dao.Pedido_MenuDao;
import com.Restaurante.Servicios.Service.Pedido_MenuService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
public class Pedido_MenuServiceImpl implements Pedido_MenuService{
    @Autowired
    private Pedido_MenuDao pedido_menuDao;
    @Override
    @Transactional(readOnly=false)
    public Pedido_Menu save(Pedido_Menu pedido_menu) {
        return pedido_menuDao.save(pedido_menu);
    }
    @Override
    @Transactional(readOnly=false)
    public void delete(int id) {
        pedido_menuDao.deleteById(id);
    }
    @Override
    @Transactional(readOnly=true)
    public Pedido_Menu findById(int id) {
        return pedido_menuDao.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly=true)
    public List<Pedido_Menu> findByAll() {
        return (List<Pedido_Menu>) pedido_menuDao.findAll();
    }
       @Override
    @Transactional(readOnly=true)
    public List<Pedido_Menu> consultarPedido(Integer idp) {
        return (List<Pedido_Menu>) pedido_menuDao.consultarPedido(idp);
    }
}

