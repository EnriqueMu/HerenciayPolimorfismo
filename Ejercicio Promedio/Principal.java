
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
   public static void main(String [] args)
   {
       Banco b1 = new Banco();
       CuentaBancaria c1=new CuentaBancaria(100);
       CuentaBancaria c2=new CuentaBancaria(200);
       CuentaBancaria c3=new CuentaBancaria(300);
       b1.agregaCuenta(c1);
       b1.agregaCuenta(c2);
       b1.agregaCuenta(c3);
       
       float prom=b1.calculaSaldo();
       System.out.println(prom);
    }
}
