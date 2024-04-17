import java.util.*;
class Student
{
    int sport;
    int maths;
    int it;
    int english;
    int total;
    Scanner s=new Scanner(System.in);
    void getData()
    {
        System.out.println("enter mark of maths:");
        maths=s.nextInt();
        System.out.println("enter mark of it:");
        it=s.nextInt();
        System.out.println("enter mark of english:");
        english=s.nextInt();    
    }
}
class Grace extends Student
{
    void sports()
    {
    System.out.println("enter mark of sports:");
    sport=s.nextInt();
    }

}
class Result extends Grace
{
    void sum()
    {
        total=maths+it+english+sport;
        
         System.out.println("mark of maths:"+maths);
         System.out.println("mark of it:"+it);
         System.out.println("mark of english:"+english);  
         System.out.println("mark of sports:"+sport); 
        System.out.println("total:"+total);
          if(total>=360)
        {
            System.out.println("a+");
        }
        else if(total>=320&&total<360)
        {
             System.out.println("grade="+"a");
        }
       
    }

    
}
class Marks
{
public static void main(String args[])
{
    Result r=new Result();
    r.getData();
    r.sports();
    r.sum();
    
}
}