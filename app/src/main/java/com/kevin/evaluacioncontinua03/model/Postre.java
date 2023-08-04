package com.kevin.evaluacioncontinua03.model;

public class Postre extends Platillo {
    private String descripcion;

    public Postre(String name, String imgUrl, String descripcion) {
        super(name, imgUrl);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
