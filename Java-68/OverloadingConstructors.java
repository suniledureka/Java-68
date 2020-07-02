class Employee 
{
	int empno;
	String name;
	float sal;

	/*-- constructor --*/
	Employee(){   }

	Employee(int empno, String name){
	  this.empno = empno;
	  this.name = name;
	}

	Employee(int a, String b, float c){
	  this.empno = a;
	  this.name = b;
	  this.sal = c;
	}

	void displayDetails(){
		System.out.println(this.empno+" | "+this.name+" | "+this.sal);
	}
}

class OverloadingConstructors 
{
	public static void main(String[] args) 
	{
	   
      Employee emp1 = new Employee();
      Employee emp2 = new Employee(101,"Sunil");
      Employee emp3 = new Employee(102,"Rahul",2500f);

      emp1.displayDetails();
      emp2.displayDetails();
      emp3.displayDetails();
	}
}