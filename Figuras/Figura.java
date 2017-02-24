
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura
{
   protected double area;
   
   public Figura()
   {
       area = 0;
    }
    
   public double accedeArea()
   {
       return area;
   }
   
   public void area()
    {
       // System.out.println("UUPS");
    }
    
    /*public String dimeInfo()
    {
        return "" + area;
    }*/
    
    @Override
    public String toString()
    {
        return "" + area;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        return this.area==((Figura)obj).area;
    }
}
