package suda;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=10;
		Supplier<Integer> sup=()->{
			return m+5;
		};
		
		System.out.println("supplier:"+sup.get());
		
		Supplier<Persons> per=()->{
			return new Persons(101,"Arjun");		};
			System.out.println(per.get());

	}
	

}
