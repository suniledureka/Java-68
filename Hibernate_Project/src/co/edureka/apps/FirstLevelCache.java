package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class FirstLevelCache {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Student st1 = session.get(Student.class, Integer.valueOf(101));
		System.out.println(st1);
		System.out.println("-------------------------------");
		
		Student st2 = session.get(Student.class, Integer.valueOf(102));
		System.out.println(st2);
		System.out.println("-------------------------------");
		
		Student st3 = session.get(Student.class, Integer.valueOf(101));
		System.out.println(st3);	
		
		session.close();
		sf.close();
	}

}
