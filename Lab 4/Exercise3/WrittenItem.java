package inheritanceAndPolymorphism;

import java.util.Scanner;

public abstract class WrittenItem extends Item
{
	private String author;
	
	private String getAuthor()
	{
		return author;
		
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	public WrittenItem()
	{
		super();
		System.out.println("Enter Author Name : ");
		setAuthor(sc.next());
		
	}
	
	public WrittenItem(int identificationNo, String title, int copiesCount, String author)
	{
		super(identificationNo, title, copiesCount);
		setAuthor(author);
		
	}
	
	public void print()
	{
		super.print();
		System.out.println("Author is : "+ getAuthor());
		
	}
}
