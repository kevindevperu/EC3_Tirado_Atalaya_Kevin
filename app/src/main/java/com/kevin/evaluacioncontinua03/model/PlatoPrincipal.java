package com.kevin.evaluacioncontinua03.model;

public class PlatoPrincipal extends Platillo {
    private String descripcion;

    public PlatoPrincipal(String name, String imgUrl, String descripcion) {
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
