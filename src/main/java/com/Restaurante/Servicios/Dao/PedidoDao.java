package com.Restaurante.Servicios.Dao;

import com.Restaurante.Servicios.Models.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
////


public interface PedidoDao extends CrudRepository <Pedido, Integer>{
    // Operación de Login
  }