import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Write a description of class Ventana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ventana extends JFrame
{
    private Lienzo dibujo;
    private Timer tiempo;
    public Ventana(int ancho, int alto)
    {
        this.setSize(ancho,alto);
        dibujo = new Lienzo();
        this.add(dibujo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.addKeyListen(dibujo);
        EscuchadorTeclado escuchaTeclado = new EscuchadorTeclado();
        this.addKeyListener(escuchaTeclado);
         EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
        tiempo = new Timer(1000, escuchaTiempo);
        tiempo.start();
    }
    
    class EscuchadorTeclado implements KeyListener
    {
        @Override
        public void keyPressed(KeyEvent k)
        {
            if(k.getKeyChar()== 'd'){
                //detener el timer...
                tiempo.stop();
            }
             else if(k.getKeyChar()=='i'){
                 tiempo.start();
                }   
            }
            //System.out.println("KeyPressed: "+ k.getKeyChar());
        

    @Override
    public void keyReleased(KeyEvent k)
    {
        //System.out.println("KeyReleased: "+ k.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent k)
    {
        //System.out.println("KeyTyped: "+ k.getKeyChar());
    }
    
}
     class EscuchadorTiempo implements ActionListener
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           //Lienzo.repaint();
           dibujo.actua();
        }
    }
}
