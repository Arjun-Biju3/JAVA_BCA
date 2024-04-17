public class Area
{
   area(int a,int c)
   {
    int length=a;
    int breadth=c;
   }
   void findArea()
   {
    int ar=(length*breadth);
      System.out.println("Area="+ar);
    
   }
  
}
class Rectangle{
    public static void main(String args[])
    {
    Area a=new Area(10,20);
    a.findArea();
    
    
    }

}