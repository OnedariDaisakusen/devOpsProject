package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "prueba")
public class Prueba {

    @Id
    @Column(name = "SERIAL")
    private Integer serial;
    @Column(name = "nombre")
    private String nombre;

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
