import ej1.Autor;
import ej1.Libro;

public class Main {
    public static void main(String[] args) {

        Autor autor1= new Autor("Rogelio", "Funes", "apetrox@torpex.com",'f');/// Hacer arreglo de Autores, para cargar el arreglo de la clase libros
        System.out.println(autor1.obtenerAutor());


        Libro libro1 = new Libro("Effective Java",450, 150,autor1.getNombre());
        System.out.print(libro1.obtenerLibro());

        libro1.setPrecio(500);
        libro1.setStock(50);
    }
}
