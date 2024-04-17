import java.util.*;
class Mark
{
	int a;


	void grade(int s)

	{
		a=s;
		if(a>=90)
		{
			System.out.println("A+");
		}
		else if(a>=80&a<90)
		{
			System.out.println("A");
		}
		else if(a>=70&a<80)
		{
			System.out.println("B+");
		}
	}
}
class Grade
{
	public static void main(String args[])
	{
	 Mark m=new Mark();

	 m.grade(90);
	}
}