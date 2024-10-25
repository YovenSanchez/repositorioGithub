package com.Restaurante.Servicios.Dao;

import com.Restaurante.Servicios.Models.Pedido_Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
////


public interface Pedido_EmpleadoDao extends CrudRepository <Pedido_Empleado, Integer>{
    // Operación de Login
  }