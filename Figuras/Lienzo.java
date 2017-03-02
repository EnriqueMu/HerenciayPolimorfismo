import  javax.swing.JPanel;
import  java.awt.Graphics;
import  java.awt.Graphics2D;
import  java.util.ArrayList;
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
    
    ArrayList <Figura> figuras = new ArrayList <Figura>();
    
    @Override
    public void paintComponent(Graphics g)
    {
       for(Figura f: figuras){
           
           f.dibuja(g);
        }
       
    }
}
