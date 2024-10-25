package com.Restaurante.Servicios.Dao;

import com.Restaurante.Servicios.Models.Pedido_Menu;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface Pedido_MenuDao extends CrudRepository <Pedido_Menu, Integer>{
    // Operación de Login
     // Operación de Login
           @Transactional(readOnly = true)
    @Query(value = "select * from Pedido_Menu where id_pedido=:idp GROUP BY id_menu ", nativeQuery = true)
    public List<Pedido_Menu> consultarPedido(@Param("idp") Integer idp);
}
    // Operación Depósito
  
