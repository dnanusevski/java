package bookpackext;

import bookpack.Book; // if more classes are inside you can use import bookpack.*


class ExtBook extends bookpack.Book{
	private String publisher;
	public ExtBook(String t, String sub, String pub){
		super(t, sub);
		
		publisher = pub;
	}
	
	public void show(){
		
		System.out.println("Shob Ext book display " + title + " / " + subtitle + " / " + publisher);
		
		// this is allwed since publisher is protected
	}
}

class BookDemo{
	public static void main(String args []){
		
		// but since we now use import we do not need to use whole name
		//bookpack.Book [] books  = new bookpack.Book[2];
		Book [] books  = new Book[2];
		
		books[0] = new bookpack.Book("Lokosi Kobra 2");
		books[1] = new bookpack.Book("Sinjorita Amalgama 2");
		
		for(bookpack.Book b : books){
			b.show();
		}
		
		ExtBook extBook1 = new ExtBook("Lokosi kobra", "mala lokosi kobra", "Goran Bregovic");
		
		//extBook1.title = "asd";  // NOT ALLOWED
	}
}