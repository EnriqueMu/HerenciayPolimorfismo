
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
   private float base;
   private float altura;
   
   public Triangulo(int x, int y, float b, float a)
   {
       super(x,y);
       base = b;
       altura = a;
    }
    
    /*public void area()
    {
        area = base*altura/2;
    }
    
     @Override
    public String toString()
    {
        return "Triangulo con area = " + super.toString();
    }*/
    
   /* public void dibuja(Graphics g)
    {
        Graphics2D
        g
    }*/
     @Override
    public void dibuja(Graphics g)
    {
       Graphics2D g2 = (Graphics2D)g;
        g2.drawPolygon(30,60,70);
    }
}
