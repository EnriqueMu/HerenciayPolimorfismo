import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String[] args)
    {
        ArrayList<Alumno> alumnos;
        
        alumnos = new ArrayList<Alumno>();
        alumnos.add(new Alumno(150));
        alumnos.add(new Alumno(100));
        alumnos.add(new Alumno(120));
        alumnos.add(new Alumno(40));
        alumnos.add(new Alumno(350));
        //transformar el ArrayList en arreglo
        
        Alumno[] arrAlumnos;
        arrAlumnos = new Alumno[alumnos.size()];
        arrAlumnos= alumnos.toArray(arrAlumnos);
        Arrays.sort(arrAlumnos);
        System.out.println("contenido del ArrayList");
        for(Alumno alu: alumnos)
            System.out.println(alu);
        System.out.println("contenido del arreglo");
        for(Alumno alu: arrAlumnos)
            System.out.println(alu);
    }
}
