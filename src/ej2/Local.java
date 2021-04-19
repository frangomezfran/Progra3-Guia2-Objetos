package ej2;

public class Local {

    private Venta ventas ; // Arraylist de ventas estaria bueno
    private ItemVenta[] productos = new ItemVenta[20];
    private int cantProductos = 0;

    //Donde seria conveniente agregar productos para el local ?


    //---------------------- Ventas ----------------------
    public Venta getVentas() {
        return ventas;
    }
    public void setVentas(Venta ventas) {
        this.ventas = ventas;
    }

    //---------------------- Productos ----------------------
    public ItemVenta[] getProductos() {
        return productos;
    }
    public void setProductos(ItemVenta[] productos) {
        this.productos = productos;
    }

    //---------------------- CantProductos ----------------------
    public int getCantProductos() {
        return cantProductos;
    }
    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }


    //---------------------- Metodos ----------------------
    public void cargaProductos(ItemVenta producto){
        this.productos[cantProductos]=producto;
        cantProductos++;
    }
    public void muestraProductos(){
        for(int i = 0 ;i < cantProductos;i++){
            System.out.println("ID: "+this.productos[i].getId()+" | Nombre: "+this.productos[i].getNombre()+" | Descripcion: "+this.productos[i].getDescripcion()+" | Precio: "+this.productos[i].getPrecioUnitario()+"$");
        }
    }

}
