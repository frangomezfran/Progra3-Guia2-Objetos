import ej1.Autor;
import ej1.Libro;

public class Main {
    public static void main(String[] args) {

        //Creamos un array de objetos de la clase Autor
        Autor joshuaBloch = new Autor("Joshua", "Bloch", "joshua@email.com",'M');//A

        System.out.println("Inciso B: "+joshuaBloch.obtenerAutor());//B

        Libro libroJava = new Libro("Effective Java",450, 150,joshuaBloch);//C

        System.out.println("Inciso D: "+libroJava.obtenerLibro());//D

        libroJava.setPrecio(500);//E
        libroJava.setStock(500); //E

        System.out.println("Inciso F: "+ libroJava.getAutor().getNombre()+" "+libroJava.getAutor().getApellido());//F

        System.out.println("Inciso G: "+libroJava.obtenerLibro());//G

        //Instancio un arreglo de autores
        Autor arregloAutoresSecundarios[] = new Autor[2]; //H

        //Cargo el arreglo
        arregloAutoresSecundarios[0] = new Autor("Juan","Haag","apetroxtrm@gmail.com",'M');
        arregloAutoresSecundarios[1] = new Autor("Franco","Gomez","frangomez0566@gmail.com",'M');

        //Cargo los autores secundarios al libro
        for(Autor aux : arregloAutoresSecundarios) {
            libroJava.addAutoresSecundarios(aux);
        }

        //Muestro el libro con sus nuevos autores
        System.out.print("Inciso H: "+libroJava.obtenerLibro());
    }
}
