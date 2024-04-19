package suda.Generics;

public class GenericClassSingleImplementationType{
	public static void main(String[] args) {
		Box<Integer> intBox=new Box<>();
		intBox.setT(20);
		System.out.println(intBox.getT());
		
		Box<String> stringBox=new Box<>();
		stringBox.setT("Java");
		System.out.println(stringBox.getT());
	}
	
	
	
}