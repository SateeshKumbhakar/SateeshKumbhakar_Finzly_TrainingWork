package library;

public class DVD extends LibraryItem{

	private int duration; 
	
	public DVD(String title, int itemID, int duration) {
		super(title, itemID);
		this.duration = duration;
	}
	
	@Override
	public void  displayInfo() {
	System.out.println("From DVD Class..");
	System.out.println("Title is = "+ this.getTitle()+"\n ItemID is = "+this.getItemID());
	System.out.println("Duration of DVD= "+ duration);	
		
	}

	

	
	
}
