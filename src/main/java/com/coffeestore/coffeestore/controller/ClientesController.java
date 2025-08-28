package com.coffeestore.coffeestore.controller;

import com.coffeestore.coffeestore.modelo.Clientes;
import com.coffeestore.coffeestore.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//se crea para definir que es una api, para que retorne un JSON

@RestController
//se define la ruta de conexion es decir la url
@RequestMapping("/api/clientes")
public class ClientesController {


    //hace la conxion de JPA
    @Autowired
    ClientesRepository clientesRepository;

    //se utiliza pora consultar todos los datos
    @GetMapping
    public List <Clientes> getAll() {
        return clientesRepository.findAll();
    }


    //se utiliza para consutar un dato por su id
    @GetMapping("/{id}")
    public Clientes getById(@PathVariable Long id){
        return clientesRepository.findById(id).orElse(null);
    }


    //se utiliza para guardar los datos de la api a la bd
    @PostMapping
    public Clientes create(@RequestBody Clientes clientes){
        return clientesRepository.save(clientes);
    }


    //se utiliza para editar los datos por id a la bd
    @PutMapping("/{id}")
    public Clientes update(@PathVariable Long id, @RequestBody Clientes clientes){
        clientes.setId_cliente(id);
        return clientesRepository.save(clientes);
    }


 // se utiliza para eliminar los datos de id a la bd
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        clientesRepository.deleteById(id);
    }

}
