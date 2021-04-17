package ej1;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;
    private Autor[] autoresSecundarios = new Autor[4];
    private int validos = 0 ;
    /*
     * La forma que se me ocurrio de resolver el problema de tener Autores como objeto de 1 cantidad y
     * tener Autores como si fuera una lista (Todavia no vi ArrayList) es hacer un Array de autoresSecundarios
     * en este caso si el libro los tiene, se agregaran con addAutoresSecundarios. Y no me saldria agregar un
     * fucking elemento en la ultima celda, no estaria utilizando correctamente el metodo .length()
     *
     * Tuve q hacer un validos porq el .length era para la Dimension del array, no los validos . Despues no pude
     * usar un foreach para concatenar los nombres en stringsDeAutores, solo lo pude hacer con el antiguo for
     * debe ser una condicion del foreach, quizaa nose, sea solo para recorrer y mostrar porq justamente el recorrido
     * del foreach es diferente q el anterior. Despues en este ejercicio es Necesario darle la dimension al arreglo .
     * */

    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }


    // --------------------------- TITULO ---------------------------
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // --------------------------- AUTOR ---------------------------
    public Autor getAutor(){
        return this.autor;
    }
    public void setAutor(Autor autor){
        this.autor=autor;
    }

    // --------------------------- AutoresSecundarios ---------------------------
    public Autor[] getAutoresSecundarios(){
        return this.autoresSecundarios;
    }
    public void addAutoresSecundarios(Autor autorSecundario)
    {
        this.autoresSecundarios[validos] = autorSecundario;
        this.validos++;
    }

    // --------------------------- PRECIO ---------------------------
    public double getPrecio() {
        return this.precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // ---------------------------STOCK---------------------------
    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }


    // --------------------------- METODOS ---------------------------
    public String obtenerLibro() {

        String stringsDeAutores = this.autor.getNombre() + " " + this.autor.getApellido();

        if( validos > 1 ) {
            for (int i = 0; i<validos;i++) {

                stringsDeAutores = stringsDeAutores + ", " + this.autoresSecundarios[i].getNombre() + " " + this.autoresSecundarios[i].getApellido() ;

            }
        }

        return "El libro, "+ this.titulo + " de " + stringsDeAutores + ". Se vende a "+ this.precio + "$" ;
    }
}