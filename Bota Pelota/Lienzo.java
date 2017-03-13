import javax.swing.JPanel;
import java.awt.Graphics;

/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel 
{
   private  Pelota pelota;
   
   public Lienzo()
   {
       pelota = new Pelota(100,100,10);
      
      
    } 
    public void actua()
    {
        pelota.muevete(this.getBounds());
        this.repaint();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        pelota.dibujate(g);
    }
}


