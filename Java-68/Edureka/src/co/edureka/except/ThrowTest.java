package co.edureka.except;

public class ThrowTest {

	public static void main(String[] args) {
		
		try {
			//ArithmeticException aex = new ArithmeticException();
			ArithmeticException aex = new ArithmeticException("cannot divide by zero");
			throw aex;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
	}
}
