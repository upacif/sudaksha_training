package com.suda.generic_record;

public class GenericRecordmain {

	public static void main(String[] args) {
		
		Pair<String,Integer > pair=new Pair<String, Integer>("arjun", 450);
		System.out.println(pair);
		System.out.println(pair.key()+" "+pair.value());
		pair.display();

	}

}
