public class Book extends Artikel {
	private String writer;
	private String genre;
	
	@Override
	public void add()
	{
		super.add();
		System.out.println("Who is the Writer?: ");
		writer=sc.next();
		System.out.println("What is the genre?: ");
		genre=sc.next();
		
	}
	
	@Override
	public void remove()
	{
		super.remove();
		System.out.println("The writer of the book is: " + writer);
		System.out.println("The genre is: " + genre);
		System.out.println();	
		
	}
	
	@Override
	public void display()
	{
		System.out.println("<<BOOK>>");
	}

}