package com.coffeestore.coffeestore.repository;

import com.coffeestore.coffeestore.modelo.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

//se extiende la conexion de la bd al JPA
public interface ClientesRepository extends JpaRepository<Clientes,Long> {
}
