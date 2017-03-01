import  javax.swing.JPanel;
import  java.awt.Graphics;
import  java.awt.Graphics2D;
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics g2 = (Graphics2D)g;
        g2.drawRect(60,60,200,200);
    }
}
