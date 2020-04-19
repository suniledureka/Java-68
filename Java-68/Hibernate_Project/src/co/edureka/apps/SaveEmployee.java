package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.domains.Employee;

public class SaveEmployee 
{
	public static void main(String[] args) 
	{
		Configuration config = new Configuration();
		config.configure("co/edureka/configs/hibernate.cfg.xml");
		
		SessionFactory sfactory = config.buildSessionFactory();
		
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee(101,"Sunil Joseph",25000.5f);
		
		session.save(emp);
		System.out.println("---------------------------");
		
		tx.commit();
		System.out.println("Employee Saved!");
		
		session.close();
		sfactory.close();
	}
}
