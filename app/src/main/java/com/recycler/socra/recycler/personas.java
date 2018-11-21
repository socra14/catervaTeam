package com.recycler.socra.recycler;

/**
 * Created by socra on 15/06/2018.
 */

public class personas {

    private int fotos;
    private String nombre;
    private String descripcion;

    public personas(){}

    public personas (int fotos, String nombre, String descripcion ){

        this.descripcion = descripcion;
        this.fotos = fotos;
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFotos() {
        return fotos;
    }

    public void setFotos(int fotos) {
        this.fotos = fotos;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
