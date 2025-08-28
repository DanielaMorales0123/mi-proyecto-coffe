package com.coffeestore.coffeestore.modelo;

import jakarta.persistence.*;

//se define la clase como identidad para ser reconiocido ppor el JPA
@Entity
// se define le nombre de la tabla tal y como esta en la base de datos
@Table(name = "clientes")
public class Clientes
{
    //se define como llave primario de tipo incremental
    //adicional se crear loss atributos con el nombre tal y conmno estan en la bd

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;
    private String nombre;
    private String documento;
    private String telefono;
    private String direccion;
    private String correo;

    // se crear los getter ande setter
    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
