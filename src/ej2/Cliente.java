package ej2;

import java.util.UUID;
import java.lang.String;

public class Cliente {

    private String id;
    private String nombre;
    private String email;
    private double porcentajeDescuento = 0;//Si no hay descuento el monto total queda igual
    private Factura factura;//Esto podria ser un arrayList


    //---------------------- Constructores ----------------------
    public Cliente(String nombre,String email,double porcentajeDescuento){
        this.id = UUID.randomUUID().toString();
        this.nombre=nombre;
        this.email=email;
        this.porcentajeDescuento=porcentajeDescuento;
    }
    public Cliente(String nombre,String email){
        this.id = UUID.randomUUID().toString();
        this.nombre=nombre;
        this.email=email;
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

    //---------------------- Email ----------------------
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //---------------------- PorcentajeDescuento ----------------------
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    //---------------------- Factura ----------------------
    public Factura getFactura() {
        return factura;
    }
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    //---------------------- Metodos ----------------------
    public String imprimeCliente(){
        return "Cliente [ id= "+ this.id +" | nombre= "+this.nombre+" | email= "+this.email+" | descuento= "+this.porcentajeDescuento+" ]";
    }

}
