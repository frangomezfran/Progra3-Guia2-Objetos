package ej1;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private Character genero;

    public Autor(String nombre, String apellido, String email, Character genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getGenero() {
        return this.genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public String obtenerAutor() {
        return "Nombre: "+this.nombre + " | Apellido:" + this.apellido + " | E-mail: " + this.email + " | Genero: " + this.genero;
    }

}