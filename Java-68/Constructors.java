class Employee 
{
	int empno;
	String name;
	float sal;
	/*-- constructor --*/
	Employee(){
      System.out.println("*****");
      empno = 0;
      name = "Sanjay";
      sal = 2500.5f;
    }

	void displayDetails(){
		System.out.println(empno+" | "+name+" | "+sal);
	}

}

class Constructors 
{
	public static void main(String[] args) 
	{
	   
      Employee emp1 = new Employee();
      Employee emp2 = new Employee();
      Employee emp3 = new Employee();

      emp1.displayDetails();
      emp2.displayDetails();
      emp3.displayDetails();
	}
}
