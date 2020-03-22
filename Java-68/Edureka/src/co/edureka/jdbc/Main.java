package co.edureka.jdbc;

import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO();
		
		/*
		Employee emp = new Employee(108, "Gopal",5000f);
		dao.saveEmp(emp);
		*/
		
		/*
		Employee emp = new Employee(101, "Sunil Joseph",5000f);
		dao.updateEmp(emp);
		*/
		
		/*
		int eno = 1015;
		Employee emp = dao.searchEmp(eno);
		if(emp != null)
			System.out.println(emp); //toString()
		else
			System.out.println("No matching Employee found!");
		*/
		
		List<Employee> emps = dao.getEmployees();
		for(Employee emp : emps) {
			System.out.println(emp);
			Thread.sleep(1500);
		}
	}
}
