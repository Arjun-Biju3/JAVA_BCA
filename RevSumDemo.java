import java.util.*;
class Revsum{
	void reverse(int num)
	{
	int res=0;
	int rem;
	while(num!=0)
	{
		rem=num%10;
		res=(res*10)+rem;
		num=num/10;
	}
	System.out.println("reverse="+res);
}
	void sum(int num)
	{ int sum=0;
		while(num!=0)
		{
			sum=sum+(num%10);
			num=num/10;
			
		}
		System.out.println("sum="+sum);
	}
	
}
class RevSumDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		Revsum rs=new Revsum();
		rs.reverse(num);
		rs.sum(num);
		
	}
}