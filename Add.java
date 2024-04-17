class Numbers
{
     int a=10;
    int b=20;
    int c;
    void addition()
    {
     c=a+b;
    }
    void display()
    {
        System.out.println("sum="+c);
    }

}
class Add
{
public static void main(String args[])
{
Numbers n = new Numbers();
n.addition();
n.display();
}
}