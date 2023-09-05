package hibernateCurdOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {
	
	// Get Session Factory
	public static SessionFactory provideSessionFactory()
    {
        Configuration config = new Configuration();
        config.configure();
        return config.buildSessionFactory();
    }
	
	
	public static void main(String[] args) {
		 
		try { 	
		SessionFactory sf = provideSessionFactory();
		getData(sf);
//		saveData(sf);
//		updateData(sf);
		deleteData(sf);
		
       }
	    catch (Exception e) {
		  System.out.println("Exception occured"+ e);
	   }
			 
		 		
}
   // Save data or insert Data 
	public static void  saveData(SessionFactory sf) {

	   Student s6 =new Student( 8,"Sateesh",11,"science");
	   
	   Session session = sf.openSession();
	   Transaction tr = session.beginTransaction(); 
		
	   session.save(s6);
		
	   tr.commit();
//	   tr.rollback();
	   session.close();
		
	}
	
	// update Data
	public static void  updateData(SessionFactory sf) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction(); 
		
		Student s1 = session.get(Student.class, 3);
		s1.setName("Ravi");
		
		session.save(s1);
		tr.commit();
//	    tr.rollback();
		session.close();
		
	}
	
	//get  Data
	public static void  getData(SessionFactory sf) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
        Student s1 = session.get(Student.class,1);
		
        System.out.println(s1);
		session.close();
		
	}
	
	
	//Delete Data
	public static void  deleteData(SessionFactory sf) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student s1 = session.get(Student.class,7);
		
		session.delete(s1);
		session.close();
		
	}
	

}
