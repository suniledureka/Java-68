package co.edureka;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		EmployeeDAO dao = (EmployeeDAO)context.getBean("empdao");
		
		/*
		//to insert an Employee
		Employee emp = new Employee(112,"Sajith",25000f);
		dao.saveEmp(emp);
		*/
		
		/*
		//to update an Employee
		Employee emp = new Employee(101,"Sunil",25000f);
		dao.updateEmp(emp);
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("enter employee no to be deleted:");
		int eno = sc.nextInt();
		dao.deleteEmp(eno);
		sc.close();
		*/
		
		
	}
}
