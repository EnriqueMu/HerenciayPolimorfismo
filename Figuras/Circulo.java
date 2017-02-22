
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private double radio;
    
    public Circulo(float r)
    {
        radio = r;
    }
    
    public void area()
    {
        area = (radio*radio*3.1416);
    }
    
    public String dimeInfo()
    {
        return "Circulo " + super.dimeInfo();
    }
}