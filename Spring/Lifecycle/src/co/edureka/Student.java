package co.edureka;

public class Student
{
 private String name;
 public Student() {
	 System.out.println("Inside 0 argument constructor");
 }
 public Student(String name) {
	 this.name = name;
	 System.out.println("Inside 1 argument constructor");
 }
public String getName() {
	System.out.println("Inside getName() method");
	return name;
}
public void setName(String name) {
	this.name = name;
	System.out.println("Inside setName() method");
}

public void myInit1() {
	System.out.println("User-defined Init method-1");
}
public void myInit2() {
	System.out.println("User-defined Init method-2");
}
public void myDestroy() {
	System.out.println("User-defined destructor....");
}
@Override
public String toString() {
	return "Student [" + name + "]";
}
 
}
