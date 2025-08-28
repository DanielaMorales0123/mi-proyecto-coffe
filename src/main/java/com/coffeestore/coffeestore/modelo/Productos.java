package com.coffeestore.coffeestore.modelo;

import jakarta.persistence.*;

import java.math.BigDecimal;

//se define la clase como identidad para ser reconiocido ppor el JPA
@Entity
// se define le nombre de la tabla tal y como esta en la base de datos
@Table(name = "productos")
public class Productos {
    //se define como llave primario de tipo incremental
    //adicional se crear loss atributos con el nombre tal y conmno estan en la bd

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;
    private String nombre;
    private String tipo;
    private Integer cantidad;
    private Integer valor;
    private String descripcion;


    //se crean los gett y sett
    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}







