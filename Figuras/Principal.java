
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
       System.out.println("El area del Triangulo es: " + t1.accedeArea());
       
       Cuadrado s1 = new Cuadrado (4);
       s1.area();
       System.out.println("El area del Cuadrado es: " + s1.accedeArea());
       
       Circulo c1 = new Circulo(2);
       c1.area();
       System.out.println("El area del Circulo es: " + c1.accedeArea());
    }
}
