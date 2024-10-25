
package com.Restaurante.Servicios.Controller;

import com.Restaurante.Servicios.Models.Empleado;
import com.Restaurante.Servicios.Service.EmpleadoService;

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
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;
    
    @PostMapping(value="/")
    public ResponseEntity<Empleado> agregar(@RequestBody Empleado empleado){        
        Empleado obj = empleadoService.save(empleado);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Empleado> eliminar(@PathVariable int id){ 
        Empleado obj = empleadoService.findById(id); 
        if(obj!=null) 
            empleadoService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
     @PutMapping(value="/") 
    public ResponseEntity<Empleado> editar(@RequestBody Empleado empleado){ 
        Empleado obj = empleadoService.findById(empleado.getId_empleado()); 
        if(obj!=null) {
            obj.setNombre(empleado.getNombre());
         
empleadoService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @GetMapping("/list")
    public List<Empleado> consultarTodo(){
        return empleadoService.findByAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public Empleado consultaPorId(@PathVariable int id){ 
        return empleadoService.findById(id); 
    }
 
}
