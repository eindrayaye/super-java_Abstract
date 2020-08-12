public class Lp extends Artikel {
	private String nameOfArtist;
	private int numberOfRecord;
	
	@Override
	public void add()
	{
		super.add();
		System.out.println("Who is the artist?: ");
		nameOfArtist=sc.next();
		System.out.println("How many numbers of records sold?: ");
		numberOfRecord=sc.nextInt();
		
	}
	
	@Override
	public void remove()
	{
		super.remove();
		System.out.println("The artist is: " + nameOfArtist);
		System.out.println("The amount of records sold is/are: " + numberOfRecord);
		System.out.println();
	}
	
	@Override
	public void display()
	{
		System.out.println("<<LP>>");
	}

}
