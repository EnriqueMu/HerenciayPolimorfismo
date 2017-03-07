
/**
 * Write a description of interface Calculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Calculo
{

    double getCal();


public static double promedio(Calculo[] objects)
{
    double sum=0;

    for(Calculo obj: objects)
    {
        sum = sum + obj.getCal();
    }
    if(objects.length > 0)
    {
        return sum/objects.length;
    }
    else
    {
        return 0;
    }
}
}