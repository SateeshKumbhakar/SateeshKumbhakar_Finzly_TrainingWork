package HibernateTask1.src.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import HibernateTask1.src.entity.Library;
import common.GetSessionFactory;


public class Client {
	public static void main(String[] args) {
	
//		addBook();
//		searchInGivenYearRange();
//		searchBySpecificAuthorName();
//		searchBySpecificTitle();
		updateBooks();
//		deleteBook();
	}
	
	public static void addBook() {
		
		SessionFactory sf = GetSessionFactory.getSessionFactory();
		Session session = sf.openSession();
		
        Library lib = new Library(1001,"the positive thought","sateesh","2012");  
        Library lib1 = new Library(1002,"propective","ravi","2022");  
        Library lib2 = new Library(1003,"the Mind ","sawan","2023");  
        Library lib3 = new Library(1004,"Power of words ","sateesh","2021");  
		
		Transaction tr = session.beginTransaction();
		
         session.save(lib);
         session.save(lib1);
         session.save(lib2);
         session.save(lib3);
         
		
		tr.commit();
		session.close();
	}
	
	public static void searchInGivenYearRange() {
		
		System.out.println("searchInGivenYearRange");
		SessionFactory sf = GetSessionFactory.getSessionFactory();
		Session session = sf.openSession();
		
	    Criteria  criteria = session.createCriteria(Library.class);
	    criteria.add(Restrictions.between("publishyear", "2021", "2023"));
	    
	    List<Library> list = criteria.list();
	    
	    for (Library library : list) {
			System.out.println(library);
		}
  
		session.close();
	}
	
	public static void searchBySpecificAuthorName() {
		System.out.println("searchBySpecificAuthorName");
		SessionFactory sf = GetSessionFactory.getSessionFactory();
		Session session = sf.openSession();
		
	    Criteria  criteria = session.createCriteria(Library.class);
	    criteria.add(Restrictions.eq("author", "sateesh"));
	    
	    List<Library> list = criteria.list();
	    
	    for (Library library : list) {
			System.out.println(library);
		}
  
		session.close();
		
	}
	public static void searchBySpecificTitle() {
		
		System.out.println("searchBySpecificTitle");
		SessionFactory sf = GetSessionFactory.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria  criteria = session.createCriteria(Library.class);
		criteria.add(Restrictions.like("title", "the%"));
		
		List<Library> list = criteria.list();
		
		for (Library library : list) {
			System.out.println(library);
		}
		
		session.close();
		
	}
	
 public static void searchBySpecificISBN() {
		
	    System.out.println("searchBySpecificISBN");
		SessionFactory sf = GetSessionFactory.getSessionFactory();
		Session session = sf.openSession();
		
	    Criteria  criteria = session.createCriteria(Library.class);
	    criteria.add(Restrictions.eq("author", "1003"));
	    
	    List<Library> list = criteria.list();
	    
	    for (Library library : list) {
			System.out.println(library);
		}
  
		session.close();
		
     }
 public static void getAllBooks() {
	 
	 System.out.println("getAllBooks");
	 SessionFactory sf = GetSessionFactory.getSessionFactory();
	 Session session = sf.openSession();
	 
	 Criteria  criteria = session.createCriteria(Library.class);
	 
	 List<Library> list = criteria.list();
	 
	 for (Library library : list) {
		 System.out.println(library);
	 }
	 
	 session.close();
	 
 }
 
 public static void updateBooks() {
	 
	 System.out.println("updateBooks");
	 SessionFactory sf = GetSessionFactory.getSessionFactory();
	 Session session = sf.openSession();
	 Library library = session.get(Library.class, 1001);
	 //updated value;
	 
	 library.setAuthor("satish New Author");
	 library.setpublishyear("2024");
	 
	 Transaction tr  = session.beginTransaction();

	 session.save(library);
	 tr.commit();
	
	 Criteria  criteria = session.createCriteria(Library.class);
	 List<Library> list = criteria.list();
	 
	 for (Library librar : list) 
		 System.out.println(librar);
	 
	
	 session.close();
	 
 }
 
 public static void deleteBook() {
	 
	 System.out.println("deleteBook");
	 
	 SessionFactory sf = GetSessionFactory.getSessionFactory();
	 Session session = sf.openSession();
	 Transaction tr  = session.beginTransaction();
	 Library library = session.get(Library.class, 1003); 
	 
	 session.delete(library);
	 tr.commit();
	 
	 Criteria  criteria = session.createCriteria(Library.class);
	 List<Library> list = criteria.list();
	 
	 for (Library librar : list)
		 System.out.println(librar);
	 
	 
	 session.close();
	 
 }
 
 
}
