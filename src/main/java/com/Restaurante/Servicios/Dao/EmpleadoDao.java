package com.Restaurante.Servicios.Dao;

import com.Restaurante.Servicios.Models.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
////


public interface EmpleadoDao extends CrudRepository <Empleado, Integer>{
    // Operación de Login
  }
