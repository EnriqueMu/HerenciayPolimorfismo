
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
       
       Pais p=new Pais();
       
       Pais p1=new Pais(25);
       Pais p2=new Pais(32);
       Pais p3=new Pais(94);
       
       p=agregaPais(p1);
       p=agregaPais(p2);
       p=agregaPais(p3);
       
       float prom=p.calculaProm();
       System.out.println(prom);
    
    }
    
}
