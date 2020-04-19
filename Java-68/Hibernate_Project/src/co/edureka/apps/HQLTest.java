package co.edureka.apps;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class HQLTest {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		/*
		String hql = "from co.edureka.domains.Student";
		TypedQuery<Student> query = session.createQuery(hql);
		*/
		
		/*
		String hql = "from co.edureka.domains.Student where sname='Pankaj'";
		TypedQuery<Student> query = session.createQuery(hql);		
		*/
		
		/*
		String hql = "from co.edureka.domains.Student where studid between ? and ? "; //positional parameters
		TypedQuery<Student> query = session.createQuery(hql);
		query.setParameter(0, 101);
		query.setParameter(1, Integer.valueOf(106));
		*/

		String hql = "from co.edureka.domains.Student where studid between :minsid and :maxsid "; //named parameters
		TypedQuery<Student> query = session.createQuery(hql);
		query.setParameter("minsid", 106);
		query.setParameter("maxsid", Integer.valueOf(110));
		
		List<Student> students = query.getResultList();
		for(Student st : students)
		{
			System.out.println(st);
			Thread.sleep(1000);
		}
		
		
		Transaction tx=session.beginTransaction();  
		TypedQuery q=session.createQuery("update co.edureka.domains.Student set sname=:name where studid=:sid");  
		q.setParameter("name","Sunil");  
		q.setParameter("sid",101);  
					      
		int status=q.executeUpdate();  
		if(status>0)
		 System.out.println("Students Updated = "+status);
		else
		 System.out.println("No matching students found!");
		
		
		session.close();
		sfactory.close();
	}
}
