package ej1;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autores;

    public Libro(String titulo, double precio, int stock, Autor autores) { /// hacer foreach para cargar arreglo de
                                                                           /// autores
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autores;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String obtenerLibro() {
        return this.titulo + " " + this.precio + " " + this.stock + " " + this.autores;
    }
}