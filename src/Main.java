import ej1.Autor;
import ej1.Libro;

public class Main {
    public static void main(String[] args) {

        Autor autor1= new Autor("Rogelio", "Funes", "apetrox@torpex.com",'f');
        System.out.println(autor1.obtenerAutor());
        Libro libro1 = new Libro("Effective Java",450, 150,(autor1.getNombre() +" "+autor1.getApellido()));
        System.out.print(libro1.obtenerLibro());
    }
}
