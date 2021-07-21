package com.example.comapapp;

public class HomeModelo {

    private String titulo, descripcion;
    private int fotoHome;

    public HomeModelo() {
    }

    public HomeModelo(String titulo, String descripcion, int fotoHome) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoHome = fotoHome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFotoHome() {
        return fotoHome;
    }

    public void setFotoHome(int fotoHome) {
        this.fotoHome = fotoHome;
    }
}
