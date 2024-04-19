package suda;

import java.util.function.Function;

public class FunctionMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Double > half=a->a/2.0;
		//System.out.println("Using apply():"+half.apply(10));
		
		half=half.andThen(a->3*a);
		
		System.out.println("Using andThen():"+half.apply(10));
		try {
		half=half.andThen(null);
		System.out.println(half.apply(10));
		}catch (Exception e) {
			System.out.println("Exception thrown while passing null value");
		}

	}

}
