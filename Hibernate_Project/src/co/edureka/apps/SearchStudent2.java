package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class SearchStudent2 {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();		
		
		try {
			Student st = session.get(Student.class, Integer.valueOf(1015));
			if(st != null)
				System.out.println(st);
			else
				System.out.println("No matching Student found!!");
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}		
		session.close();
		sf.close();
	}
}
