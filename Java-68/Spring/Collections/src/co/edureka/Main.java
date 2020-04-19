package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Database db = (Database)context.getBean("db");
		
		List<String> dbNames = db.getDbNames();
		System.out.println(dbNames);
		
		for(String name : dbNames) {
			System.out.println(name);
		}
	}
}