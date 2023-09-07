package common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateTask1.src.entity.Library;

public final class GetSessionFactory {
	
	
	private GetSessionFactory() {}
	
	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		conf.configure( );
		conf.addAnnotatedClass(Library.class);
		
		return conf.buildSessionFactory();
	}
	

}