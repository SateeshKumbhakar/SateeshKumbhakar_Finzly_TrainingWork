package HibernateCriteria.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import HibernateCriteria.common.GetSessionFactory;
import HibernateCriteria.entity.Employee;

public class Client {
	public static void main(String[] args) {
		
		SessionFactory sf = GetSessionFactory.getSessionFactory();
		Session session = sf.openSession();
		
//		Employee emp1 = new Employee(101, "Sateesh", "12345", "Founder", 1);
//		Employee emp2 = new Employee(102, "Sashi", "12345", "MD", 1);
//		Employee emp3 = new Employee(103, "Sahid", "-12345", "CEO", -1);
//		Employee emp4 = new Employee(104, "Ravi", "98765", "Manager", 5);
//		Employee emp5 = new Employee(105, "Saravana", "$24,880 cr", "CTO", 5);
		Employee emp6 = new Employee(106, "Aryan", "$ 10 lakh", "CFO", 5);
		
		Transaction tr = session.beginTransaction();
		
//		session.save(emp1);
//		session.save(emp2);
//		session.save(emp3);
//		session.save(emp4);
		session.save(emp6);
		
		tr.commit();
		session.close();
	}
}
