import java.util.Scanner;

public abstract class Artikel {
	protected Scanner sc;
	private String name;
	private String publisher;
	private int yearOfRelease;
	
	public Artikel()
	{
		sc=new Scanner(System.in);
	}
	
	public void add()
	{
		System.out.println("Please add the name of Artikel: ");
		name=sc.next();
		System.out.println("Publisher name: ");
		publisher=sc.next();
		System.out.println("Year of release: ");
		yearOfRelease=sc.nextInt();
	}
	
	public void remove()
	{
		System.out.println("Name of the Artikel - " + name );
		System.out.println("Publisher - " + publisher );
		System.out.println("Released Year - " + yearOfRelease );
	}

	public abstract void display();
	
	
}