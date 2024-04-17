import java.util.*;
class PrimeDemo
{
	void prime(int num) {
		int flag=0;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
System.out.println(num+"is a prime");
		System.out.println(num+"is not a prime");
		
	}
	void palindrome(int num)
	{
		int res=0;
		int rem;
		int n;
		n=num;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
		}
		if(res==n)
			System.out.println(num+"is a palindrome");
		System.out.println(num+"is not a palindrome");
	}
	void armstrong(int num)
	{
		int n,r,sum=0;
		n=num;
		while(num!=0)
		{
		r=num%10;
		sum=sum+(r*r*r);
		num=num/10;
		}
		if(sum==n)
			System.out.println(n+"is armstrong");
		System.out.println(n+"is not armstrong");
	}
}
class Prime{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		System.out.println("\n1.prime or not \n2.palindrome or not\n3.armstrong or not");
		System.out.println("enter the your choice");
		int ch=s.nextInt();
		PrimeDemo p=new PrimeDemo();
		switch(ch)
		{
		case 1:
			p.prime(num);
			break;
		case 2:
			p.palindrome(num);
			break;
		case 3:
			p.armstrong(num);
			break;
			default:
				System.out.println("invalid choice");
				break;
		}
	}
}