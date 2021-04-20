package ej3;

public class CuentaBancariaDeudor extends CuentaBancaria implements Iextraer {

   public CuentaBancariaDeudor(double balance, Duenio duenio){
       super(balance,duenio);//La cuenta deudor tiene bien el id ?
   }

    @Override
    public boolean extraer (double aExtraer){
        if(aExtraer > 0 && aExtraer<=this.balance+2000){
            this.balance-=aExtraer;
            actualizaOperacionesRetirado(aExtraer);
            return true;
        }
        return false;
    }

}
