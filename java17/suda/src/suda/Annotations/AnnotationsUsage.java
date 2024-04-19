package suda.Annotations;


import java.util.ArrayList;
import java.util.Date;

public class AnnotationsUsage {
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused", "deprecation" })
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("sonoo");
		list.add("vimal");
		list.add("ratan");
		Date today=new Date();
		Date  tomorrow= new Date(2021,04,15);
	}
	

}

class Animal{
	void eatSomething() {
		System.out.println("eating something");
	}
}

class Dog extends Animal{
	@Override
	void eatSomething() {
		System.out.println("eating foods");
	}
}