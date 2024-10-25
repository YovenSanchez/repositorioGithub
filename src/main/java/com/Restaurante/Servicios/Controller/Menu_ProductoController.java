
package com.Restaurante.Servicios.Controller;

import com.Restaurante.Servicios.Models.Menu_Producto;
import com.Restaurante.Servicios.Service.Menu_ProductoService;

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
@RequestMapping("/menu_producto")
public class Menu_ProductoController {
    @Autowired
    private Menu_ProductoService menu_productoService;
    
    @PostMapping(value="/")
    public ResponseEntity<Menu_Producto> agregar(@RequestBody Menu_Producto menu_producto){        
        Menu_Producto obj = menu_productoService.save(menu_producto);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Menu_Producto> eliminar(@PathVariable int id){ 
        Menu_Producto obj = menu_productoService.findById(id); 
        if(obj!=null) 
            menu_productoService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
     @PutMapping(value="/") 
    public ResponseEntity<Menu_Producto> editar(@RequestBody Menu_Producto menu_producto){ 
        Menu_Producto obj = menu_productoService.findById(menu_producto.getId_menu_producto()); 
        if(obj!=null) {
menu_productoService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @GetMapping("/list")
    public List<Menu_Producto> consultarTodo(){
        return menu_productoService.findByAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public Menu_Producto consultaPorId(@PathVariable int id){ 
        return menu_productoService.findById(id); 
    }
 
}
