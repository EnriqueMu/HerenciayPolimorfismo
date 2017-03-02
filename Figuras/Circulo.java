
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(int x, int y, float r)
    {
        super(x,y);
        radio = r;
    }
    
    /*@Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Circulo)
        {
            return this.radio==((Circulo)obj).radio;
        }
        else
        {
            return false;
        }
    }
    
    public void area()
    {
        area = (radio*radio*3.1416);
    }
    
    /*public String dimeInfo()
    {
        return "Circulo " + super.dimeInfo();
    }*/
    
    /*@Override
    public String toString()
    {
        return "Circulo con area = " + super.toString();
    }*/
    @Override
    public void dibuja(Graphics g)
    {
       Graphics2D g2 = (Graphics2D)g;
       g2.drawCircle(20,30,60,70);
    }
}