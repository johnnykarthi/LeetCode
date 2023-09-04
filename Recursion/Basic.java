package Recursion;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		System.out.println( fib(9));
	 
	}
	
	static int fib(int n)
	{
		if(n <= 1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	
	
	static int fibanocci(int n)
	{
		int a =0,b=1,c;
		if(n == 0)
			return a;
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
	
	static int fact(int n)
	{
		if(n == 1)
			return 1;
		return n*fact(n-1);
	}

}
