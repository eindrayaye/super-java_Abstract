public class Boardgame extends Artikel {
	private String numPlayer;
	private String avgPlaytime;
	
	@Override
	public void add()
	{
		super.add();
		System.out.println("How many players?: ");
		numPlayer=sc.next();
		System.out.println("Play time (Hours)?: ");
		avgPlaytime=sc.next();
		
	}
	
	@Override
	public void remove()
	{
		super.remove();
		System.out.println("This game need players of: " + numPlayer);
		System.out.println("Total length of time to complete this game is " + avgPlaytime);
		System.out.println();
	}
	
	@Override
	public void display()
	{
		System.out.println("<<BOARDGAME>>");
	}
		

	public static void main(String args[])
	{
		Artikel l=new Lp();
		l.display();
		l.add();
		l.remove();
		System.out.println("*************");
		
		Artikel bk=new Book();
		bk.display();
		bk.add();
		bk.remove();
		System.out.println("*************");
		
		Artikel bg=new Boardgame();
		bg.display();
		bg.add();
		bg.remove();
		System.out.println("****END*****");
		
	}

	
	
    
}

