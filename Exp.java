class Exp
{
    public static void main(String args[])
    {
        int b=8;
        for(int i=0;i<8;i++)
        {
            for(int j=(8-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
 