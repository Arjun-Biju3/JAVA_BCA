import java.util.*;
class Add
{
    Scanner s=new Scanner(System.in);
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    void add()
    {
    System.out.println("ENTER THE FIRST MATRIX:");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
        a[i][j]=s.nextInt();
        }
    }
      System.out.println("ENTER THE SECOND MATRIX:");
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
        c[i][j]=a[i][j]+b[i][j];
        }
    }

    }
    void display()
    {
          System.out.println("ERESULT:");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
        System.out.print(c[i][j]+" ");
        }
        System.out.println(" ");
    }
    }

}
class Madd
{
    public static void main(String args[])
    {
        Add a=new Add();
        a.add();
        a.display();
    }
}