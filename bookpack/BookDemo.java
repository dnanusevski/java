package bookpack;

class Book{
	private String title;
	
	Book(String t){
		title = t;
	}
	
	void show(){
		System.out.println("Book title is " + title);
	}
}