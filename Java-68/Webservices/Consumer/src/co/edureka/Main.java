package co.edureka;

public class Main {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator = new NumsServiceLocator(); 
		Nums ref = locator.getNums();
		System.out.println("Sum = "+ ref.addNum(11, 24));
		System.out.println("Diff = "+ ref.subNum(23f, 12f));
	}
}
