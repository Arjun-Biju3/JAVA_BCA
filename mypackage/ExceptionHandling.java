public class ExceptionHandling
{
    public static void main(String args[])
    {
        System.out.println("one");
        System.out.println("two");
        try
        {
            System.out.println("before divide");
            int a=1/0;
            System.out.println("after divide");
        }
        catch(ArithmeticException ae)
        {
           System.out.println("a number cannnot be divided by zero");
        }


        System.out.println("three");
        System.out.println("four");
    }


}