package com.example.comapapp;
public class ReporteModelo {
    private String titulo, descripcion;
    private int fotoReporte;

    public ReporteModelo() {
    }

    public ReporteModelo(String titulo, String descripcion, int fotoReporte) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoReporte = fotoReporte;
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

    public int getFotoReporte() {
        return fotoReporte;
    }

    public void setFotoReporte(int fotoReporte) {
        this.fotoReporte = fotoReporte;
    }
}
