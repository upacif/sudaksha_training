package suda;

public abstract class Shape {
	protected int length;
	protected int breadth;
	protected int radius;
	public Shape(int radius) {
		super();
		this.radius = radius;
	}
	
	public Shape(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public abstract double area();
	

}
