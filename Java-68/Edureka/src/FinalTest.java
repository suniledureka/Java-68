class Parent{
	final void display() {}
	void method() {}
}

class Child extends Parent{
	//void display() {} //CE
	void method() {}
}

public class FinalTest {
	final int n = 25; // instance variable
	final int age; //blank final variable
	FinalTest(){
		this.age=35;
	}
	public static void main(String[] args) {
		/*
		final int n = 25; // local variable
		System.out.println(n);
		//n = 26; //CE-final local variable n cannot be assigned
		System.out.println(n);
		*/
		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		System.out.println(obj.age);
		//obj.n = 25; //CE
		System.out.println(obj.n);
		
		//Child c = new Child();
	}
}
