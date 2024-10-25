
package com.Restaurante.Servicios.Controller;

import com.Restaurante.Servicios.Models.Producto;
import com.Restaurante.Servicios.Service.ProductoService;

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
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    
    @PostMapping(value="/")
    public ResponseEntity<Producto> agregar(@RequestBody Producto producto){        
        Producto obj = productoService.save(producto);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Producto> eliminar(@PathVariable int id){ 
        Producto obj = productoService.findById(id); 
        if(obj!=null) 
            productoService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
     @PutMapping(value="/") 
    public ResponseEntity<Producto> editar(@RequestBody Producto producto){ 
        Producto obj = productoService.findById(producto.getId_producto()); 
        if(obj!=null) {
            obj.setNombre(producto.getNombre());
          obj.setDescripcion(producto.getDescripcion());
          obj.setPrecio(producto.getPrecio());
         
productoService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @GetMapping("/list")
    public List<Producto> consultarTodo(){
        return productoService.findByAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public Producto consultaPorId(@PathVariable int id){ 
        return productoService.findById(id); 
    }
 
}
