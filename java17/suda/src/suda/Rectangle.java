package suda;

public class Rectangle extends Shape {

	public Rectangle(int length, int breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return length*breadth;
	}
	
}
