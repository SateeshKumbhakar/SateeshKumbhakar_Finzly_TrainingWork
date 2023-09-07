package HibernateCriteria.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import HibernateCriteria.common.GetSessionFactory;
import HibernateCriteria.entity.Employee;

public class GetOneRecord {
	
public static void main(String[] args) {
		
		SessionFactory sf = GetSessionFactory.getSessionFactory();
		Session session = sf.openSession();
	
		
		 Employee employee = session.get(Employee.class, 101);
		 System.out.println(employee);  
	    
		
		
		
		session.close();
	}

}
