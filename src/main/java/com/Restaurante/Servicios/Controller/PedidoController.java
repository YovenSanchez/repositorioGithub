
package com.Restaurante.Servicios.Controller;

import com.Restaurante.Servicios.Models.Pedido;
import com.Restaurante.Servicios.Service.PedidoService;

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
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    
    @PostMapping(value="/")
    public ResponseEntity<Pedido> agregar(@RequestBody Pedido pedido){        
        Pedido obj = pedidoService.save(pedido);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Pedido> eliminar(@PathVariable int id){ 
        Pedido obj = pedidoService.findById(id); 
        if(obj!=null) 
            pedidoService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
     @PutMapping(value="/") 
    public ResponseEntity<Pedido> editar(@RequestBody Pedido pedido){ 
        Pedido obj = pedidoService.findById(pedido.getId_pedido()); 
        if(obj!=null) {
            obj.setValor_pedido(pedido.getValor_pedido());
          obj.setFecha(pedido.getFecha());
          obj.setDireccion(pedido.getDireccion());
           
pedidoService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @GetMapping("/list")
    public List<Pedido> consultarTodo(){
        return pedidoService.findByAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public Pedido consultaPorId(@PathVariable int id){ 
        return pedidoService.findById(id); 
    }
 
}
