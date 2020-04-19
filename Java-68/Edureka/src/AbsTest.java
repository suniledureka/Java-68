
public class AbsTest {

	public static void main(String[] args) {
		Shape sh = null;
		//sh = new Shape(); // an abstract class cannot be instantiated
		sh = new Circle("Blue",15.5f);
		System.out.println("Color = "+ sh.getColor());
		sh.area();
		System.out.println("---------------------------");
		sh = new Rectangle("Yellow",12,8);
		sh.area();
	}
}
