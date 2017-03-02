import java.awt.Color;
/**
 * Write a description of class Rombo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rombo extends Figura
{
    public Rombo(int x, int y)
    {
        super(x,y);
    }
    
    @Override
    public void dibuja(Graphics g)
    {
       Color nuevo = new Color(12,33,25);}       Graphics2D g2 = (Graphics2D)g;
       g2.drawPolygon(20,30,60,70);
    }
}
