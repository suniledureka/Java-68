
public abstract class Shape {
 String color;
 /* constructor */
 Shape(String color){
	 this.color = color;
 }
 String getColor() {
	 return color;
 }
 void setColor(String color) {
	 this.color = color;
 }
 abstract void area();
}
