package suda;

public class MainClassOfShapes {
	
	public static void main(String[] args) {
		int lenght=15;
		int breadth=10;
		int radius=5;
		Rectangle rectangle=new Rectangle(lenght, breadth);
		Circle circle=new Circle(radius);
		System.out.println("Area of rectangle is:"+rectangle.area());
		System.out.println("Area of circle is :"+circle.area());
	}

}
