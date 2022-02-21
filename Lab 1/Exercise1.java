import java.util.*;

class Exercise1
{
	public static int sumOfTheCubesOfDigits(int num)
	{
		int sum = 0;
		
		while(num>0)
		{
			int digit = num%10;
			sum = sum + (int)(Math.pow(digit,3));
			num = num/10;
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		int res = sumOfTheCubesOfDigits(num);

		System.out.println("Sum is :"+res);
	}
}