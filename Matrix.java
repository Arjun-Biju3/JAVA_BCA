import java.util.*;
class Matrix
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int arr[][]=new int[2][2];
        int ar[][]=new int[2][2];
        System.out.println("enter the  elements of first matrix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("enter the  elements of second matrix");
          for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }
         System.out.println("first matrix");
          for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
             System.out.println();
        }
         System.out.println("second matrix");
          for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(ar[i][j]+"  ");
             
            }
            System.out.println(" ");
        }
        int c[][]=new int[2][2];
             
            System.out.println(" ");

        for (int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=arr[i][j]+ar[i][j];
                  System.out.print(c[i][j]+" "+" ");

            }
            System.out.println("");
        }

    }
}
