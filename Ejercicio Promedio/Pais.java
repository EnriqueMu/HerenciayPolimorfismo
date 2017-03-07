
/**
 * Write a description of class Pais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pais implements Calculo
{
   private int habitantes;
   
   public Pais(int hab)
   {
       habitantes=hab;
   }
   
     public double getCal()
    {
        return habitantes;
    }
}
