import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
   private ArrayList<Figura> figuras= new ArrayList <Figura>();
   
   public Lienzo()
   {
       
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawString("Hola Mundo", 100, 200);
        g2.drawRect(50, 30, 20, 40);
        g2.drawLine(60, 70, 100, 90);
    }
}
