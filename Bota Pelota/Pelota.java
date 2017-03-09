import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota
{
   private int posx;
   private int posy;
   private int radio;
   
   public Pelota(int x, int y, int r)
   {
       posx = x;
       posy=y;
       radio=r;
    }
    
    public void dibujate(Graphics g)
    {
        g.drawOval(posx, posy, radio*2, radio*2);
    }
    
   
}
