import java.util.ArrayList;
import java.util.Iterator;
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
       
       Circulo c1 = new Circulo(3);
       c1.area();
       System.out.println("El area del Circulo es: " + c1.accedeArea());
       
       ArrayList <Figura> figuras = new ArrayList <Figura>();
       
       figuras.add(t1);
       figuras.add(s1);
       figuras.add(c1);
       
       /*for(int i=0;i<figuras.length;i++){
           
           figuras[i].area();
        }
        
       for(int j=0;j<figuras.length;j++){
           
           System.out.println("El area del "  +  figuras[j]+"es: "  +  figuras[j].accedeArea());
        }*/
        
        /*for(Figura f: figuras)
        {
            f.area();
        }
        
        for(Figura f: figuras)
        {
            System.out.println("El area del "  +  f+"es: "  +  f.accedeArea());
        }*/
        
        Iterator <Figura> it = figuras.iterator();
        
        while(it.hasNext())
        {
            Figura f=it.next();
            f.area();
            
            System.out.println("El area del "  +  f+"es: "  +  f.accedeArea());
        }
        
        
    }
           
}
