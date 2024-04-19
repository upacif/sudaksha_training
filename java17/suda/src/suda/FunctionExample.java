package suda;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> strToInt=x->Integer.valueOf(x);
		System.out.println("stringToInt="+strToInt.apply("57"));
		int x1=strToInt.apply("100");
		System.out.println(x1+50);
		Function<Integer, Double> sqrt=sq->Math.sqrt(sq);
		System.out.println("sq. root="+sqrt.apply(9));

	}

}
