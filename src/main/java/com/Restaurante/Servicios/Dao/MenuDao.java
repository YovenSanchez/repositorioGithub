package com.Restaurante.Servicios.Dao;

import com.Restaurante.Servicios.Models.Menu;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
////


public interface MenuDao extends CrudRepository <Menu, Integer>{
    // Operación de Login


  }