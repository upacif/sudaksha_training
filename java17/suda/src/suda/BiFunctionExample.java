package suda;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Persons, Persons, Integer> bi=(p1,p2)->{
			return p1.getCode()+p2.getCode();
		};
		System.out.println(bi.apply(new Persons(25,"mlk"), new Persons(45,"mlku")));
		
		BiFunction<Integer, Integer, Integer> add=(a,b)->{
			return a+b;
		};
		System.out.println("Add="+add.apply(10, 20));

	}

}
