package com.example.quiz2.noticia;

public class News {
    private String imagen;
    private String nombre;
    private String curso;

    public News(String imagen, String titulo, String descripcion) {
        this.imagen= imagen;
        this.nombre= titulo;
        this.curso= descripcion;

    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
