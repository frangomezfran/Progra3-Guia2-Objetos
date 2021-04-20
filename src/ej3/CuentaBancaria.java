package ej3;
import java.awt.font.TextHitInfo;
import java.util.Scanner;
import java.util.UUID;

public class CuentaBancaria implements Iextraer{

    protected String id; //Raro q sean protected pienso
    protected double balance = 0;
    protected Duenio duenio;
    protected String[] operaciones = new String[10];
    protected int cantOperaciones = 0;


    //---------------------- Constructores ----------------------
    public CuentaBancaria(double balance, Duenio duenio) {
        this.id = UUID.randomUUID().toString();
        this.balance = balance;
        this.duenio = duenio;
    }

    //---------------------- ID ----------------------
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    //---------------------- Balance ----------------------
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //---------------------- Duenio ----------------------
    public Duenio getDuenio() {
        return duenio;
    }
    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    //---------------------- Operaciones ----------------------
    public String[] getOperaciones() {
        return operaciones;
    }
    public void setOperaciones(String[] operaciones) {
        this.operaciones = operaciones;
    }

    //---------------------- CantOperaciones ----------------------
    public int getCantOperaciones() {
        return cantOperaciones;
    }
    public void setCantOperaciones(int cantOperaciones) {
        this.cantOperaciones = cantOperaciones;
    }

    //---------------------- Metodos ----------------------
    public String imprimeCuenta(){
        return "Cuenta [ Id: "+this.getId()+" | Balance : "+this.getBalance()+"$ ]\n"+this.duenio.imprimeCliente();
    }

    protected void actualizaOperacionesDepositado(double aDepositar){
        operaciones[cantOperaciones]= "El duenio "+this.getDuenio().getNombre()+", depositó "+aDepositar+"$";
        cantOperaciones++;
    }
    public boolean depositar(double aDepositar){
        if(aDepositar>0){
            this.balance+=aDepositar;
            actualizaOperacionesDepositado(aDepositar);
            return true;
        }
        return false;
    }

    protected void actualizaOperacionesRetirado(double aExtraer){
        operaciones[cantOperaciones]= "El duenio "+this.getDuenio().getNombre()+", retiró "+aExtraer+"$";
        cantOperaciones++;
    }
    @Override
    public boolean extraer (double aExtraer){
        if(aExtraer > 0 && aExtraer<=this.balance){
            this.balance-=aExtraer;
            actualizaOperacionesRetirado(aExtraer);
            return true;
        }
        return false;
    }

    public void imprimeOperaciones(){ //No me gusta el Print adentro de la clase

        System.out.println("\nCuenta de "+this.getDuenio().getNombre());

        for (int i = 0 ; i<this.cantOperaciones ;i++) { //Uso este for porque el foreach me da un error de NullPointer
            System.out.println((i+1)+") "+this.operaciones[i]);
        }

    }

    public void menu(Scanner input) {

        int operacion = 0;

        System.out.println("Bienvenido a su cuenta "+this.getDuenio().getNombre()+"\n"+this.imprimeCuenta());

        do {
            System.out.println("\nQue desea hacer ? ( BALANCE = " + this.getBalance() + "$ )\n1) Depositar\n2) Extraer\n3) Salir");
            operacion = input.nextInt();

            switch (operacion) {
                case 1:
                    System.out.println("Ingrese cantidad de dinero a depositar ( BALANCE = " + this.getBalance() + "$ )");

                    if (this.depositar(input.nextDouble()))
                        System.out.println("EXITO AL DEPOSITAR");
                    else
                        System.out.println("ERROR AL DEPOSITAR"); //Si ingresan -1 es error

                    break;

                case 2:
                    System.out.println("Ingrese cantidad de dinero a Extraer (BALANCE :" + this.getBalance() + "$)");

                    if (this.extraer(input.nextDouble()))
                        System.out.println("EXITO AL EXTRAER");
                    else
                        System.out.println("ERROR AL EXTRAER"); //Si ingresan -1 es error

                    break;

                case 3:
                    System.out.println("SALIENDO...\n");
                    break;

                default:
                    System.out.println("Operacion mal ingresada");
                    break;

            }
        } while (operacion != 3);

    }

}
