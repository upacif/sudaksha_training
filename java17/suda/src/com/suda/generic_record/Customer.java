package com.suda.generic_record;

public record Customer(int code,String name) {
	public  Customer {
		System.out.println("This is simple constructor");
	}

	public int code() {
		return code;
	}

	public String name() {
		return name;
	}
	
	

}
