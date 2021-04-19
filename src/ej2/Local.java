package ej2;

public class Local {

    private Venta ventas ;
    private ItemVenta[] productos = new ItemVenta[20];
    private int cantProductos = 0;

    // podria poner aca las facturas de cada cliente, quiza franco
    // fue 3 veces a comprar, serian 3 facturas para franco
    // Setear las ventas en cada celda


    public Venta getVentas() {
        return ventas;
    }
    public void setVentas(Venta ventas) {
        this.ventas = ventas;
    }


    public ItemVenta[] getProductos() {
        return productos;
    }
    public void setProductos(ItemVenta[] productos) {
        this.productos = productos;
    }


    public int getCantProductos() {
        return cantProductos;
    }
    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }


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
