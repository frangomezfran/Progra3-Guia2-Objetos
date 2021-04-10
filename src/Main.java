import ej1.Autor;
import ej1.Libro;

public class Main {
    public static void main(String[] args) {

        //Creamos un array de objetos de la clase Autor
        Autor arregloAutores[] = new Autor[3];

        //Creamos objetos en cada posicion
        arregloAutores[0] = new Autor("Joshua", "Bloch", "joshua@email.com",'M');/// Hacer arreglo de Autores, para cargar el arreglo de la clase libros
        arregloAutores[1] = new Autor("Juan","Haag","apetroxtrm@gmail.com",'M');
        arregloAutores[2] = new Autor("Franco","Gomez","frangomez0566@gmail.com",'M');

        //Ponemos el arreglo de autores en un libro
        Libro libro1 = new Libro("Effective Java",450, 150,arregloAutores);


        System.out.print(libro1.obtenerLibro());
        libro1.setPrecio(500);
        libro1.setStock(50);
    }
}
