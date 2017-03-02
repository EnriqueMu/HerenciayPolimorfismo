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
    
    public void agregaPais(Pais pai)
    {
        paises.add(pai);
    }
    
    public float calculaProm()
    {
        int suma=0;
        
        for(int i=0;i<paises.size();i++)
        {
            suma=suma + (paises.get(i)).getHabitantes();
        }
        float prom=(float)suma/(float)paises.size();
        return prom;
    }
}
