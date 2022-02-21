package inheritanceAndPolymorphism;

import java.util.Scanner;

public abstract class MediaItem extends Item
{
	private int runTime;
	
	public int getRunTime()
	{
		return runTime;
		
	}
	
	public void setRunTime(int runTime)
	{
		this.runTime = runTime;
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	public MediaItem()
	{
		super();
		System.out.println("Enter Runtime : ");
		setRunTime(sc.nextInt());
		
	}
	
	void print()
	{
		super.print();
		System.out.println("Runtime is : " + getRunTime());
		
	}
}
