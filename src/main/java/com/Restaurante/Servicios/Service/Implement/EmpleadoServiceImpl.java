package com.Restaurante.Servicios.Service.Implement;

import com.Restaurante.Servicios.Models.Empleado;
import com.Restaurante.Servicios.Dao.EmpleadoDao;
import com.Restaurante.Servicios.Service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
  @Autowired
    private EmpleadoDao empleadoDao;
    @Override
    @Transactional(readOnly=false)
    public Empleado save(Empleado empleado) {
        return empleadoDao.save(empleado);
    }
    @Override
    @Transactional(readOnly=false)
    public void delete(int id) {
        empleadoDao.deleteById(id);
    }
    @Override
    @Transactional(readOnly=true)
    public Empleado findById(int id) {
        return empleadoDao.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly=true)
    public List<Empleado> findByAll() {
        return (List<Empleado>) empleadoDao.findAll();
    }
      
}
