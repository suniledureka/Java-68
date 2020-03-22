class A2{
	A2(){		
		System.out.println("Class A2 Constructor");
	}
}
class B2 extends A2{
	B2(){
		System.out.println("Class B2 Constructor");
	}
}

public class SuperConstructors {
	public static void main(String[] args) {		
		B2 obj = new B2();
	}
}
