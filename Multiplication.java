import java.util.*;
class Matrix
{
    
        int a[][]=new int[3][3];
    int b[][]=new int[3][3];
     int c[][]=new int[3][3];
     void getData()
     {
     Scanner s=new Scanner(System.in);
     System.out.println("enter I matrix");
     for(int i=0;i<3;i++)
     {
       for(int j=0;j<3;j++)
       {
        a[i][j]=s.nextInt();
       } 
     }
     System.out.println("enter 2 matrix");
     for(int i=0;i<3;i++)
     {
       for(int j=0;j<3;j++)
       {
        b[i][j]=s.nextInt();
       } 
     }
     }

     void result()
     {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            c[i][j]=a[i][j]-b[i][j];
        } 
      }
     }
     void display()
     {
     System.out.println("result");
      
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
           System.out.print(c[i][j]+"  "); 
        } 
        System.out.println(" ");
      }
     }

    }
    class Multiplication
    {
        public static void main(String args[])
        {
          Matrix m=new Matrix();
          m.getData();
          m.result();
          m.display();
        }
    }
