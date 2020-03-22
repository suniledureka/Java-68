
public class Circle extends Shape{
	float radius;
	Circle(String color, float radius){
		super(color);
		this.radius = radius;
	}
	void area() {
		System.out.println("Area of Circle = "+(Math.PI*radius*radius));
	}
}
