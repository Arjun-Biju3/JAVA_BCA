import java.util.*;
class Sort
{
public static void main(String args[])
{
    int arr[]=new int[5];
    Scanner s=new Scanner(System.in);
    for(int i=0;i<5;i++)
    {
      arr[i]=s.nextInt();
    }
    int temp;
    for(int i=0;i<5;i++)
    {
        for(int j=i+1;j<5;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println("sorted array:");
    for(int i=0;i<5;i++)
    {
        System.out.println(arr[i]+"");
    }
    
}
}