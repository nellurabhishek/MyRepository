import java.util.*;

class Exercise3
{	
	public static int nonRecusiveFib(int n)
	{
		int n1 = 1, n2 = 1, n3 = n1 + n2;
		
		if(n == 0)
			return 0;
		else if(n == 1 || n == 2)
			return 1;

		while(n>2)//1
		{
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			n--;
		}
		return n3;
	}

	public static int recursiveFib(int n)
	{
		if (n == 1 || n == 0)
		{
       			return n;
		}

		return recursiveFib(n-1) + recursiveFib(n-2);
	}	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		int res1 = nonRecusiveFib(n);
		System.out.println(n+"th value of fib sequence is :"+res1);

		int res2 = recursiveFib(n);
		System.out.println(n+"th value of fib sequence is :"+res2);
	}
}