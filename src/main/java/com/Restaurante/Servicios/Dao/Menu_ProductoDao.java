
package com.Restaurante.Servicios.Dao;

import com.Restaurante.Servicios.Models.Menu_Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
////


public interface Menu_ProductoDao extends CrudRepository <Menu_Producto, Integer>{
    // Operación de Login
  }
