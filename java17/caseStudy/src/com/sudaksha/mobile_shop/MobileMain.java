package com.sudaksha.mobile_shop;

import java.util.HashMap;
import java.util.List;

public class MobileMain {
	
	public static void main(String[] args) {
		String searchKey="Vivo";
		MobileOperations operations=new MobileOperations(new HashMap<String,List<String>>());
		Mobile mobile=new Mobile("Oppo", "A55");
		operations.addMobile(mobile.getBrand(), mobile.getModel());
		Mobile mobile1=new Mobile("Oppo", "A56");
		operations.addMobile(mobile1.getBrand(), mobile1.getModel());
		Mobile mobile2=new Mobile("Vivo", "k10");
		HashMap<String, List<String>> mobiles1=operations.addMobile(mobile2.getBrand(), mobile2.getModel());
		System.out.println(mobiles1);
		
		System.out.println("Bellow search "+searchKey+" \n====================");
		operations.searchMobile(searchKey);
		
		System.out.println(" Buy brand "+mobile.getBrand()+" Model "+mobile.getModel());
		operations.buyMobile(mobile.getBrand(),mobile.getModel());
		
		System.out.println("\n Remaining mobiles are:"+mobiles1);
		
	
	}

}
