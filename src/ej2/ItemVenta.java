package ej2;

public class ItemVenta {
    private int id;
    private String nombre;
    private String descripcion;
    private double precioUnitario;
    //private int stock;
    //private String gondola;
    //private String cantidad; // Coca-cola 2,25 , Coca-cola 3 , ...

    //---------------------- Constructores ----------------------
    public ItemVenta(int id, String nombre, String descripcion, double precioUnitario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    //---------------------- ID ----------------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //---------------------- Nombres ----------------------
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //----------------------- Descripcion ----------------------
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //---------------------- PrecioUnitario ----------------------
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

}
