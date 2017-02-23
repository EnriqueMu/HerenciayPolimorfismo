
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Figura
{
   private float lado;
   
   public Cuadrado(float l)
   {
       lado = l;
    }
    
    public void area()
    {
        area = lado*lado;
    }
    
     @Override
    public String toString()
    {
        return "Cuadrado con area = " + super.toString();
    }
}
