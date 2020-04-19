class A{
 int a=10, b=20;
 void displayAB() {
	 System.out.println("In class A: "+ this.a+" | "+this.b);
 }
}

class B extends A{
 int c=30, d=40;
 void displayC() {
	 System.out.println("In class B: "+ this.a+" | "+this.b+" | "+this.c+" | "+this.d);
 }
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		B obj = new B(); 
		System.out.println("Main Method: "+ obj.a+" | "+obj.b+" | "+obj.c+" | "+obj.d);
		obj.displayAB();
		obj.displayC();
	}
}
