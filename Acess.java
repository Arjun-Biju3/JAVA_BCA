import java.util.*;
class Acess
{
    public static void main(String args[])
    {
        String arr[][]=new String[2][2];
        Scanner s=new Scanner(System.in);
        System.out.println("enter elements");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
            arr[i][j]=s.nextLinen();
            }
            
        }
        System.out.println("array elements are");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
            System.out.print(arr[i][j]);
            }
            System.out.println(" ");
            
        }
        


    }
}