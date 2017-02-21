
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
       
       Figura [] figuras = new Figura[3];
       
       figuras[0]=t1;
       figuras[1]=s1;
       figuras[2]=c1;
       
       for(int i=0;i<figuras.length;i++){
           
           figuras[i].area();
        }
        
       for(int j=0;j<figuras.length;j++){
           
           
        }
    }
           
}
