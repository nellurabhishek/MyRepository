import java.util.*;

class Exercise2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Select one of the three lights by pressing 1 or 2 or 3");
		System.out.println("1.Red\n2.Yellow\n3.Green");

		int choice = sc.nextInt();
	
		switch(choice)
		{
			case 1: System.out.println("Stop");
				break;

			case 2: System.out.println("Ready");
				break;

			case 3: System.out.println("Go");	
				break;
		}
	}
}