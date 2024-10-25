
package com.Restaurante.Servicios.Controller;

import com.Restaurante.Servicios.Models.Pedido_Empleado;
import com.Restaurante.Servicios.Service.Pedido_EmpleadoService;
import java.util.Date;

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
@RequestMapping("/pedido_empleado")
public class Pedido_EmpleadoController {
    @Autowired
    private Pedido_EmpleadoService pedido_empleadoService;
    
    @PostMapping(value="/")
    public ResponseEntity<Pedido_Empleado> agregar(@RequestBody Pedido_Empleado pedido_empleado){        
        Pedido_Empleado obj = pedido_empleadoService.save(pedido_empleado);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Pedido_Empleado> eliminar(@PathVariable int id){ 
        Pedido_Empleado obj = pedido_empleadoService.findById(id); 
        if(obj!=null) 
        
            pedido_empleadoService.delete(id); 
        else
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
     @PutMapping(value="/") 
    public ResponseEntity<Pedido_Empleado> editar(@RequestBody Pedido_Empleado pedido_empleado){ 
        Pedido_Empleado obj = pedido_empleadoService.findById(pedido_empleado.getId_pedido_empleado()); 
        if(obj!=null) {
        
              obj.setFecha(pedido_empleado.getFecha());
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @GetMapping("/list")
    public List<Pedido_Empleado> consultarTodo(){
        return pedido_empleadoService.findByAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public Pedido_Empleado consultaPorId(@PathVariable int id){ 
        return pedido_empleadoService.findById(id); 
    }
 
}
