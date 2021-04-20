package ej3;

import java.util.UUID;

public class Duenio { //Lo llamo Duenio porque en el ej2 existe una clase Cliente

    private String id;
    private String nombre;
    private char genero;

    //---------------------- Constructores ----------------------
    public Duenio(String nombre, char genero) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.genero = genero;
    }

    //---------------------- ID ----------------------
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    //---------------------- Nombre ----------------------
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //---------------------- Genero ----------------------
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    //---------------------- Metodos ----------------------
    public String imprimeCliente(){
        return "Duenio [ Id: "+this.getId()+" | Nombre: "+this.getNombre()+" | Genero: "+this.genero+" ]";
    }


}
