package ej2;

import java.time.*;
import java.util.Date;
import java.util.UUID;

public class Factura {

    private String id;
    private double montoTotal;
    private LocalDate fecha;
    private Cliente cliente;
    private Venta venta;

    //---------------------- Contructor ----------------------
    public Factura(Cliente cliente,Venta venta) {
        this.id = UUID.randomUUID().toString();
        this.fecha = LocalDate.now();
        //Podria hacer el montoTotal en Venta
        //Pero en Factura en donde hacemos la cuenta del tota, descuento, cuentas, etc
        this.montoTotal = venta.getMontoTotalVentas();
        this.cliente = cliente;
        this.venta = venta;
    }

    //---------------------- Id ----------------------
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    //---------------------- MontoTotal ----------------------
    public double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    //---------------------- Fecha ----------------------
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    //---------------------- Cliente ----------------------
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //---------------------- Metodos ----------------------
    public double calculaMontoFinal(){
        return (this.montoTotal) - ( (this.cliente.getPorcentajeDescuento() * this.montoTotal) / (100) );
    }

    public String imprimeFacturaCliente(){
        return "Factura [ id= "+this.id+" | fecha= "+this.fecha+" | monto= "+this.montoTotal+"$ | montoDesc= "+this.calculaMontoFinal()+"$ ]\n"+this.cliente.imprimeCliente();
    }



}
