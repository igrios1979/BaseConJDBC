package org.ignacio.rios.models;

import java.util.Date;

public class Producto {

    private Long id;
    private Integer precio;
    private Date fechaRegistro;
    private  String nombre;


    public Producto() {
    }

    public Producto(Long id, Integer precio, Date fechaRegistro, String nombre) {
        this.id = id;
        this.precio = precio;
        this.fechaRegistro = fechaRegistro;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String leftAlignFormat = "| %-10s | %-10d | %-20s | %-30s |\n";
        return "+------------+------------+----------------------+--------------------------------+\n" +
                "| ID         | Precio     | Fecha de registro    | Nombre                         |\n" +
                "+------------+------------+----------------------+--------------------------------+\n" +
                String.format(leftAlignFormat, id, precio, fechaRegistro, nombre) +
                "+------------+------------+----------------------+--------------------------------+\n";
    }
}
