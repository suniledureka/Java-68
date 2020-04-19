package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		session.beginTransaction();
		
		Student st = session.get(Student.class, Integer.valueOf(112));
		if(st!=null) {
			System.out.println(st);
			session.delete(st);
		}
		else
			System.out.println("No matching student found!");
		
		session.getTransaction().commit();
		session.close();
		sfactory.close();
	}
}
