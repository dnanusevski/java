package bookpack;

public class Book{
	protected String title;
	protected String subtitle; // :D
	
	public Book(String t){
		title = t;
	}
	
	public Book(String t, String subt){
		title = t;
		subtitle = subt;
	}
	
	public void show(){
		System.out.println("Book title is " + title + " / " + subtitle);
	}
}