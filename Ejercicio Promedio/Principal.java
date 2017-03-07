
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
       /*Banco b1 = new Banco();
       CuentaBancaria c1=new CuentaBancaria(100);
       CuentaBancaria c2=new CuentaBancaria(200);
       CuentaBancaria c3=new CuentaBancaria(300);
       b1.agregaCuenta(c1);
       b1.agregaCuenta(c2);
       b1.agregaCuenta(c3);
       
       float prom=b1.calculaSaldo();
       System.out.println(prom);
       
       Planeta po=new Planeta();
       
       Pais p1=new Pais(25);
       Pais p2=new Pais(32);
       Pais p3=new Pais(94);
       
       po.agregaPais(p1);
       po.agregaPais(p2);
       po.agregaPais(p3);
       
       float pro=po.calculaProm();
       System.out.println(pro);*/
       
      Calculo[] cuentas = new Calculo[3];
       cuentas[0] = new CuentaBancaria(100);
       cuentas[1] = new CuentaBancaria(200);
       cuentas[2] = new CuentaBancaria(300);
       
       double promSaldo = Calculo .promedio(cuentas);
       System.out.println(promSaldo);
       
       Calculo[] paises = new Calculo[3];
       paises[0] = new Pais(25);
       paises[1] = new Pais(32);
       paises[2] = new Pais(94);
       
       double promArea = Calculo.promedio(paises);
       System.out.println(promArea);
       
    
    }
    
}
