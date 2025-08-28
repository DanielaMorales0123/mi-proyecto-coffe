package com.coffeestore.coffeestore.repository;

import com.coffeestore.coffeestore.modelo.Clientes;
import com.coffeestore.coffeestore.modelo.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos,Long> {
}
