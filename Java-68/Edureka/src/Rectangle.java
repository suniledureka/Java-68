
public class Rectangle extends Shape{
 int length, breadth;
 Rectangle(String color, int length, int breadth){
	 super(color);
	 this.length = length;
	 this.breadth = breadth;
 }
 void area() {
	 System.out.println("Area of Rectangle = "+(this.length * this.breadth));
 }
}
