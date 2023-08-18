package library;

public class Library {
	
	public static void main(String[] args) {
		Book book = new Book("Mindfullness",1001,"Sateesh");
		DVD dvd  = new DVD("DVD1",101,2);
		
		book.displayInfo();
		System.out.println();
		dvd.displayInfo();
		
		//Reservation
	    LibraryMember student = new StudentMember(101, "Ravi Sharma");
	    LibraryMember faculty = new StudentMember(101, "Rohit kumar");
	    
	    System.out.println("\n Student Activity");
	    student.borrowItem(dvd);
	    student.borrowItem(book);
	    student.reserveItem(dvd);
	    student.reserveItem(book);
	    
	    
	    System.out.println(" \n Faculty Activity");
	    
	    faculty.borrowItem(dvd);
	    faculty.borrowItem(book);
	    
	    faculty.reserveItem(dvd);
	    faculty.reserveItem(book);
	    
	   
	    
	    
	}

}
