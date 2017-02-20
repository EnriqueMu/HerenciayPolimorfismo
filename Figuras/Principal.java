
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
       Triangulo t1 = new Triangulo (3,4);
       t1.area();
       System.out.println("El are del Triangulo es: " + t1.accedeArea());
    }
}
