import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Figura
{
   //protected double area;
   
   private int posx;
   private int posy;
   
   public Figura(int x, int y)
   {
       //area = 0;
       
       posx = x;
       posy = y;
    }
    
    protected int dimeX()
    {
        return posx;
    }
    
    protected int dimeY()
    {
        return posy;
    }
    
    public abstract void dibuja (Graphics g);
   /*public double accedeArea()
   {
       return area;
   }
   
   public void area()
    {
       // System.out.println("UUPS");
    }*/
    
    /*public String dimeInfo()
    {
        return "" + area;
    }*/
    
    /*@Override
    public String toString()
    {
        return "" + area;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        return this.area==((Figura)obj).area;
    }*/
}
