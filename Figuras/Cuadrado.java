
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Figura
{
   private int lado;
   
   public Cuadrado(int x, int y, int l)
   {
       super(x,y);
       lado = l;
    }
    
    /*public void area()
    {
        area = lado*lado;
    }
    
     @Override
    public String toString()
    {
        return "Cuadrado con area = " + super.toString();
    }*/
    
    @Override
    public void dibuja(Graphics g)
    {
       Graphics2D g2 = (Graphics2D)g;
        g2.drawRect(20,30,60,70);
    }
}
