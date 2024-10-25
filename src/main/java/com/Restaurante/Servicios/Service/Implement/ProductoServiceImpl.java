
package com.Restaurante.Servicios.Service.Implement;

import com.Restaurante.Servicios.Models.Producto;
import com.Restaurante.Servicios.Dao.ProductoDao;
import com.Restaurante.Servicios.Service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private ProductoDao productoDao;
    @Override
    @Transactional(readOnly=false)
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }
    @Override
    @Transactional(readOnly=false)
    public void delete(int id) {
        productoDao.deleteById(id);
    }
    @Override
    @Transactional(readOnly=true)
    public Producto findById(int id) {
        return productoDao.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly=true)
    public List<Producto> findByAll() {
        return (List<Producto>) productoDao.findAll();
    }
      
}

