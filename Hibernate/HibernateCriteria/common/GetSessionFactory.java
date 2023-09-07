package HibernateCriteria.common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateCriteria.entity.Employee;

public final class GetSessionFactory {
	
	
	private GetSessionFactory() {}
	
	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		conf.configure("hibernatecriteria.cfg.xml");
		conf.addAnnotatedClass(Employee.class);
		
		return conf.buildSessionFactory();
	}
	

}
