package inheritanceAndPolymorphism;

import java.util.Scanner;

public class Video extends MediaItem
{
	private String director;
	private String genre;
	private int year;
	
	public String getDirector()
	{
		return director;
		
	}
	
	public void setDirector(String director)
	{
		this.director = director;
		
	}
	
	public String getGenre()
	{
		return getGenre();
		
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
		
	}
	
	public int getYear()
	{
		return year;
		
	}
	
	public void setYear(int year)
	{
		
		this.year = year;
	
	}
	
	Scanner sc = new Scanner(System.in);
	
	public Video()
	{
		super();
		
		System.out.println("Enter Director Name :");
		setDirector(sc.next());
		
		System.out.println("Enter Gnere : ");
		setGenre(sc.next());
		
		System.out.println("Enter Released Year : ");
		setYear(sc.nextInt());
		
	}
	
	void print()
	{
		super.print();
		
		System.out.println("Director Name : " + getDirector() + "\n" + "Genre : " + getGenre() + "\n" + "Released Year : " + getYear());
	
	}
}
