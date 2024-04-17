class Stars
{
    public static void main(String args[])
    {
        
        int b=6;
        
       /*
       //right triangle
        for(int i=0;i<b;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }*/
        //left trianlge
        for(int i=0;i<b;i++)
        {
            for(int j=(b-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
         /*for(int i=0;i<b;i++)
        {
            for(int j=(b-i);j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }*/
    }
}