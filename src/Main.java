import ej1.*;
import ej2.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       System.out.println("Eliga el ejercico a ver : 1 - 2 - 3");

       Scanner input = new Scanner(System.in);

       switch (input.nextInt()) {

           case 1 :
               //Creamos un array de objetos de la clase Autor
               Autor joshuaBloch = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');//A

               System.out.println("Inciso B: " + joshuaBloch.obtenerAutor());//B

               Libro libroJava = new Libro("Effective Java", 450, 150, joshuaBloch);//C

               System.out.println("Inciso D: " + libroJava.obtenerLibro());//D

               libroJava.setPrecio(500);//E
               libroJava.setStock(500); //E

               System.out.println("Inciso F: " + libroJava.getAutor().getNombre() + " " + libroJava.getAutor().getApellido());//F

               System.out.println("Inciso G: " + libroJava.obtenerLibro());//G

               //Instancio un arreglo de autores
               Autor arregloAutoresSecundarios[] = new Autor[2]; //H

               //Cargo el arreglo
               arregloAutoresSecundarios[0] = new Autor("Juan", "Haag", "apetroxtrm@gmail.com", 'M');
               arregloAutoresSecundarios[1] = new Autor("Franco", "Gomez", "frangomez0566@gmail.com", 'M');

               //Cargo los autores secundarios al libro
               for (Autor aux : arregloAutoresSecundarios) {
                   libroJava.addAutoresSecundarios(aux);
               }

               //Muestro el libro con sus nuevos autores
               System.out.print("Inciso H: " + libroJava.obtenerLibro());

               break;

           case 2 :

               Cliente franco = new Cliente("Franco Gomez","frangomez0566@gmail.com",10);//B
               System.out.println(franco.imprimeCliente()+"\n");

               /*
               Factura facturaFranco = new Factura(100,franco);//C
               System.out.println("Monto total= "+facturaFranco.calculaMontoFinal()+"$");

               System.out.println(facturaFranco.imprimeFacturaCliente());//D
               */

               //Creo un local
               Local chinos = new Local();

               //Cargo productos en el local
               chinos.cargaProductos(new ItemVenta(0,"Coca Cola","Bebida Coca Cola de 2,25L",160));
               chinos.cargaProductos(new ItemVenta(1,"Pepitos","Galletitas Pepitos 300gr",90));
               chinos.cargaProductos(new ItemVenta(2,"Bizcochos","Galletitas Bizcochos Don Satur 200gr",50));


               System.out.println("Lista de productos : \n");
               chinos.muestraProductos();

               Venta ventaFran =  new Venta(franco,chinos);

               int idProductoAcomprar;

               System.out.println("\nIngrese ID del producto a comprar : (9 para salir)");

               //Caso donde el usuario no ingrese nada erroneo
               do {
                   idProductoAcomprar=input.nextInt();
                   if(idProductoAcomprar < (chinos.getCantProductos()) && idProductoAcomprar >= 0 ) {
                       ventaFran.haciendoCompra(chinos.getProductos()[idProductoAcomprar]);
                       System.out.println("Comprado !");
                   }else{
                       System.out.println("Numero mal ingresado");
                   }
               }while(idProductoAcomprar!=9);

               System.out.println("A generar la Factura...\n\nFactura : ");

               Factura facturaFran = new Factura(franco,ventaFran);

               System.out.println(facturaFran.imprimeFacturaCliente());

               break;

       }
    }
}
