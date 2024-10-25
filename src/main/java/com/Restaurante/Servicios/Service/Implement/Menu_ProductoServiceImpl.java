package com.Restaurante.Servicios.Service.Implement;

import com.Restaurante.Servicios.Models.Menu_Producto;
import com.Restaurante.Servicios.Dao.Menu_ProductoDao;
import com.Restaurante.Servicios.Service.Menu_ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
public class Menu_ProductoServiceImpl implements Menu_ProductoService{
  @Autowired
    private Menu_ProductoDao menu_productoDao;
    @Override
    @Transactional(readOnly=false)
    public Menu_Producto save(Menu_Producto menu_producto) {
        return menu_productoDao.save(menu_producto);
    }
    @Override
    @Transactional(readOnly=false)
    public void delete(int id) {
        menu_productoDao.deleteById(id);
    }
    @Override
    @Transactional(readOnly=true)
    public Menu_Producto findById(int id) {
        return menu_productoDao.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly=true)
    public List<Menu_Producto> findByAll() {
        return (List<Menu_Producto>) menu_productoDao.findAll();
    }
      
}
