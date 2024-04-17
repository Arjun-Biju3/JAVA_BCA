package mypackage;
import java.util.*;
public class Tiangle
{
    public void area()
    {
    Scanner s=new Scanner(System.in);
     int b;
     int h;
    System.out.println("enter the base length:");
    b=s.nextInt();
      System.out.println("enter the height:");
    h=s.nextInt();
    double ar;
    ar=0.5*(b*h);
      System.out.println("AREA:"+ar);
    }

}