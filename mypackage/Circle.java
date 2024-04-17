package mypackage;
import java.util.*;
public class Circle
{
   public  void area()
    {
        int r;
        Scanner s=new Scanner(System.in);
        System.out.println("enter radius of circle:");
        r=s.nextInt();
        double area=3.14*r*r;
        System.out.println("Area:"+area);
    }
}