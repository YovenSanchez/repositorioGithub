
package com.Restaurante.Servicios.Controller;

import com.Restaurante.Servicios.Models.Menu;
import com.Restaurante.Servicios.Service.MenuService;

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
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;
    
    @PostMapping(value="/")
    public ResponseEntity<Menu> agregar(@RequestBody Menu menu){        
        Menu obj = menuService.save(menu);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Menu> eliminar(@PathVariable int id){ 
        Menu obj = menuService.findById(id); 
        if(obj!=null) 
            menuService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
     @PutMapping(value="/") 
    public ResponseEntity<Menu> editar(@RequestBody Menu menu){ 
        Menu obj = menuService.findById(menu.getId_menu()); 
        if(obj!=null) {
            obj.setNombre(menu.getNombre());
          obj.setDescripcion(menu.getDescripcion());
          obj.setPrecio(menu.getPrecio());
          obj.setDisponibilidad(menu.getDisponibilidad());
menuService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @GetMapping("/list")
    public List<Menu> consultarTodo(){
        return menuService.findByAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public Menu consultaPorId(@PathVariable int id){ 
        return menuService.findById(id); 
    }
 
}
