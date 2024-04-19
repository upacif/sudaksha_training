package com.suda.generic_record;

public class CustomerMain {
	public static void main(String[] args) {
		Customer cust=new Customer(101, "Sudaksha");
		System.out.println(cust.code()+" "+cust.name());
	}

}
