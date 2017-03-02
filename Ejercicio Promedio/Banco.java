import java.util.ArrayList;
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
    //ArrayList <CuentaBancaria> col = new ArrayList <CuentaBancaria>();
    
    private ArrayList <CuentaBancaria> col;
    public Banco()
    {
        col=new ArrayList <CuentaBancaria>();
    }

    public void agregaCuenta(CuentaBancaria cuenta)
    {
        col.add(cuenta);
    }
    
    public float calculaSaldo()
    {
        int suma=0;
        for(int i=0;i<col.size();i++)
        {
            suma=suma + (col.get(i)).getSaldo();
            
        }
        
        float prom=(float)suma/(float)col.size();
        return prom;
    }
}
