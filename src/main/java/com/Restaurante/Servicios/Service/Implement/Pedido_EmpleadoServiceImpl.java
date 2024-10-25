
package com.Restaurante.Servicios.Service.Implement;

import com.Restaurante.Servicios.Models.Pedido_Empleado;
import com.Restaurante.Servicios.Dao.Pedido_EmpleadoDao;
import com.Restaurante.Servicios.Service.Pedido_EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
public class Pedido_EmpleadoServiceImpl implements Pedido_EmpleadoService{
    @Autowired
    private Pedido_EmpleadoDao pedido_empleadoDao;
    @Override
    @Transactional(readOnly=false)
    public Pedido_Empleado save(Pedido_Empleado pedido_empleado) {
        return pedido_empleadoDao.save(pedido_empleado);
    }
    @Override
    @Transactional(readOnly=false)
    public void delete(int id) {
        pedido_empleadoDao.deleteById(id);
    }
    @Override
    @Transactional(readOnly=true)
    public Pedido_Empleado findById(int id) {
        return pedido_empleadoDao.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly=true)
    public List<Pedido_Empleado> findByAll() {
        return (List<Pedido_Empleado>) pedido_empleadoDao.findAll();
    }
      
}

