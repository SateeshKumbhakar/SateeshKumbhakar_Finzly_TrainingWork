package library;



public class StudentMember extends LibraryMember {

	
	public StudentMember(int memberID, String name) {
		super(memberID, name);
		 
	}

	@Override
	public void borrowItem(LibraryItem libraryItem) {
	    
		System.out.println("Student Memeber");
	    System.out.println("MemberID is= "+this.getMemberID()+"\n Member Name= "+ this.getName()+"\n");
	    System.out.println("Item Title = "+libraryItem.getTitle() +"\n ItemId = "+ libraryItem.getItemID()+"\n");
	   
//	    libraryItem.displayInfo();	
    
	}



}
