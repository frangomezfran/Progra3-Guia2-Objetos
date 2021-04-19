package ej2;

public class Venta {

    private Cliente cliente;
    private Factura factura;
    private Local local;
    private ItemVenta[] itemAComprar = new ItemVenta[20];
    private int cantItems = 0; // Con el arraylist esto se iria


    //---------------------- Constructores ----------------------
    public Venta(Cliente cliente,Local local) {
        this.cliente = cliente;
        this.local = local;
    }

    //---------------------- Cliente ----------------------
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //---------------------- itemsAComprar ----------------------
    public ItemVenta[] getItemAComprar(){
        return this.itemAComprar;
    }
    public void setItemAComprar(ItemVenta[] itemAComprar){
        this.itemAComprar = itemAComprar;
    }

    //---------------------- Factura ----------------------
    public Factura getFactura() {
        return factura;
    }
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    //---------------------- Metodos ----------------------
    public void haciendoCompra(ItemVenta productoSeleccionado){
        this.itemAComprar[cantItems]=productoSeleccionado;
        cantItems++;
    }
    public double getMontoTotalVentas(){
        double montoTotal=0;
        for (int i = 0 ; i < cantItems ; i++) {
            montoTotal+=this.itemAComprar[i].getPrecioUnitario();
        }
        return montoTotal;
    }


}
