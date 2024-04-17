import java.util.*;
class MatrixSub
{
    public static void main(String args[])
    {
        int a[][]=new int[3][3];
    int b[][]=new int[3][3];
     int c[][]=new int[3][3];
     
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
      
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            c[i][j]=a[i][j]-b[i][j];
        } 
      }
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