package com.coffeestore.coffeestore.controller;


import com.coffeestore.coffeestore.modelo.Clientes;
import com.coffeestore.coffeestore.modelo.Productos;
import com.coffeestore.coffeestore.repository.ClientesRepository;
import com.coffeestore.coffeestore.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//se define la ruta de conexion es decir la url
@RequestMapping("/api/productos")
public class ProductosController {

//hace la conxion de JPA
@Autowired
ProductosRepository productosRepository;

//se utiliza pora consultar todos los datos
@GetMapping
public List<Productos> getAll() {
    return productosRepository.findAll();
}


//se utiliza para consutar un dato por su id
@GetMapping("/{id}")
public Productos getById(@PathVariable Long id){
    return productosRepository.findById(id).orElse(null);
}


//se utiliza para guardar los datos de la api a la bd
@PostMapping
public Productos create(@RequestBody Productos productos){
    return productosRepository.save(productos);
}


//se utiliza para editar los datos por id a la bd
@PutMapping("/{id}")
public Productos update(@PathVariable Long id, @RequestBody Productos productos){
    productos.setId_producto(id);
    return productosRepository.save(productos);
}


// se utiliza para eliminar los datos de id a la bd
@DeleteMapping("/{id}")
public void delete(@PathVariable Long id){
    productosRepository.deleteById(id);
}

}