package Ejercicio5;

public class Pelicula {
    private String codigo;
    private String titulo;
    private String genero;
    private int duracion;

    //metodo constructor
    public Pelicula(String codigo, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Género: " + genero + ", Duración: " + duracion + " mins";
    }
}
