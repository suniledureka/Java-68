class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		empno = 102;
		name = "Rahul";
		sal = 5000.5f;
	}

	void displayDetails(){
		System.out.println(empno+" | "+name+" | "+sal);
	}

	public static void main(String[] args) 
	{
		/*ceate an object of type Employee*/
		Employee emp = new Employee();

		/*access the state of object*/
		System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);

		/*-- change state of object using reference -- */
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500.5f;
		emp.displayDetails();	

		/*-- change state of object using method -- */
		emp.setDetails();
		emp.displayDetails();
	}
}
