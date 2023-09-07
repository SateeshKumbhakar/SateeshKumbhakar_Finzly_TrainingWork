package HibernateCriteria.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import HibernateCriteria.common.GetSessionFactory;
import HibernateCriteria.entity.Employee;


public class GetAllRecord {
	public static void main(String[] args) {
		
		SessionFactory sf = GetSessionFactory.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
	    List<Employee>  list = criteria.list();
	    
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		
		session.close();
	}
}
