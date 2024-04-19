package suda;

public class Circle extends Shape {
	public Circle( int radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		
		return  3.14* radius*radius;
	}

}
