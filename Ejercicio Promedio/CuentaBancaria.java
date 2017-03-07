
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria implements Calculo
{
    private int saldo;
    
    public CuentaBancaria(int sal)
    {
        saldo=sal;
    }
    
    public double getCal()
    {
        return saldo;
    }
}
