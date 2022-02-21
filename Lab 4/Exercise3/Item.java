package inheritanceAndPolymorphism;

import java.util.Scanner;

public abstract class Item
{
	private int identificationNo;
	private String title;
	private int copiesCount;
	
	public Item()
	{
		
	}
	
	public Item(int identificationNo, String title, int copiesCount)
	{
		this.identificationNo = identificationNo;
		this.title = title;
		this.copiesCount = copiesCount;
		
	}
	
	public int getIdentificationNo()
	{
		return identificationNo;
		
	}
	
	public void setIdentificationNo(int identificationNo)
	{
		this.identificationNo = identificationNo;
		
	}
	
	public String getTitle()
	{
		return title;
		
	}
	
	public void setTitle(String title)
	{
		this.title = title;
		
	}
	
	public int getCopiesCount()
	{
		return copiesCount;
		
	}
	
	public void setCopiesCount(int copiesCount)
	{
		this.copiesCount = copiesCount;
		
	}
	
	public void Item()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Identification Number : ");
		setIdentificationNo(sc.nextInt());
		
		System.out.println("Title : ");
		setTitle(sc.next());
		
		System.out.println("Number of Copies : ");
		setCopiesCount(sc.nextInt());
		sc.close();
	
	}
	
	void print()
	{
		System.out.println("ID : "+getIdentificationNo() + "\n" + "Title : " + getTitle() + "\n" + "Copies : " + getCopiesCount());
	
	}
	

}
