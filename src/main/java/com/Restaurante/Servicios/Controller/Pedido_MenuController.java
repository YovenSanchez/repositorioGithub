
package com.Restaurante.Servicios.Controller;

import com.Restaurante.Servicios.Models.Pedido_Menu;
import com.Restaurante.Servicios.Service.Pedido_MenuService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/pedido_menu")
public class Pedido_MenuController {
    @Autowired
    private Pedido_MenuService pedido_menuService;
    
    @PostMapping(value="/")
    public ResponseEntity<Pedido_Menu> agregar(@RequestBody Pedido_Menu pedido_menu){        
        Pedido_Menu obj = pedido_menuService.save(pedido_menu);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Pedido_Menu> eliminar(@PathVariable int id){ 
        Pedido_Menu obj = pedido_menuService.findById(id); 
        if(obj!=null) 
            pedido_menuService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
     @PutMapping(value="/") 
    public ResponseEntity<Pedido_Menu> editar(@RequestBody Pedido_Menu pedido_menu){ 
        Pedido_Menu obj = pedido_menuService.findById(pedido_menu.getId_pedido_menu()); 
        if(obj!=null) {
            obj.setCantidad(pedido_menu.getCantidad());
            obj.setValortotal(pedido_menu.getValortotal());
    pedido_menuService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @GetMapping("/list")
    public List<Pedido_Menu> consultarTodo(){
        return pedido_menuService.findByAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public Pedido_Menu consultaPorId(@PathVariable int id){ 
        return pedido_menuService.findById(id); 
    }
        @GetMapping("/visualizarPedido/{id})")
    public List<Pedido_Menu> consultarPedido(@RequestParam("idp") Integer idp){
        return pedido_menuService.consultarPedido(idp); 
    }
 
}
