import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import ej1.Autor;
import ej1.Libro;

public class Main {
    public static void main(String[] args) {

        //Creamos un array de objetos de la clase Autor
        Autor joshuaBloch = new Autor("Joshua", "Bloch", "joshua@email.com",'M');//A
        Autor arregloAutores[] = new Autor[3];

        System.out.println("Obteniendo a Joshua :\n"+joshuaBloch.obtenerAutor());//B

        Libro libro = new Libro("Effective Java",450, 150,joshuaBloch);//C

        //Creamos objetos en cada posicion
        arregloAutores[0] = joshuaBloch;/// Hacer arreglo de Autores, para cargar el arreglo de la clase libros
        arregloAutores[1] = new Autor("Juan","Haag","apetroxtrm@gmail.com",'M');
        arregloAutores[2] = new Autor("Franco","Gomez","frangomez0566@gmail.com",'M');

        //Ponemos el arreglo de autores en un libro
        libro.setAutores(arregloAutores);


        System.out.print(libro.obtenerLibro());
        libro.setPrecio(500);
        libro.setStock(50);
    }
}
