package library;

public class LibraryItem {
   private String title;
   private int itemID;
   
   public LibraryItem(String title, int itemID) {
	   super();
	   this.title = title;
	   this.itemID = itemID;
   }
   
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getItemID() {
	return itemID;
}
public void setItemID(int itemID) {
	this.itemID = itemID;
}

  public void displayInfo() {
	  System.out.println("Hello From Library System ...");
	  System.out.println( "Title is= " + title +"\n itemId is= "+ itemID+"\n");
  }
  
  
	

}
