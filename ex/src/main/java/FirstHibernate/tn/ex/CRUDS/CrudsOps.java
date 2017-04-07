package FirstHibernate.tn.ex.CRUDS;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class CrudsOps {
	
	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		System.out.println("CVG and hbm files loaded successfully");
		Session session = sf.openSession() ;
		session.beginTransaction();
		System.out.println("Transaction Began");
	}

}
