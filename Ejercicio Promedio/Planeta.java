import java.util.ArrayList;
/**
 * Write a description of class Planeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planeta
{
    private ArrayList<Pais> paises;
    
    public Planeta()
    {
        paises =new ArrayList<Pais>();
    }
    
    public void agragaPlaneta(Pais p)
    {
        paises.add(p);
    }
    
    public float calculaProm()
    {
        int suma;
        
        for(int i=0;i<paises.size();i++)
        {
            suma=suma + (paises.get(i)).getHabitantes();
        }
        float prom=suma/paises.size();
        return prom;
    }
}
