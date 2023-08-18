package library;

public class Book extends LibraryItem{
	
	private String author;
	
	public Book(String title, int itemID, String author) {
		super(title, itemID);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
	@Override
	public void displayInfo() {
		
		System.out.println("From Book Class..");
		
		System.out.println("Title is = "+ this.getTitle()+"\n ItemID is = "+this.getItemID());
		System.out.println("Author  is "+ author);
	}

}
