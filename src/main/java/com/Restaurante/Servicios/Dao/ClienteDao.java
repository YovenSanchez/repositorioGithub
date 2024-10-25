package com.Restaurante.Servicios.Dao;

import com.Restaurante.Servicios.Models.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
////


public interface ClienteDao extends CrudRepository <Cliente, Integer>{
    // Operación de Login
  }