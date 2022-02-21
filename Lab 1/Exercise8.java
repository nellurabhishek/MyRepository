import java.util.*;

class Exercise8
{
	public static boolean checkNumber(int n)
	{
		int i = 1;

		while((int)Math.pow(2,i) < n)
		{
			i++;
		}
		if((int)Math.pow(2,i) == n)
			return true;
		return false;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
	
		if(checkNumber(n))
			System.out.println(n+" is power of two");
		else
			System.out.println(n+" is not power of two");
	}
}