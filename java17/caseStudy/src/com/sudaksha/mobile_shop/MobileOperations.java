package com.sudaksha.mobile_shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MobileOperations {
	
	HashMap<String, List<String>> mobiles;

	public HashMap<String, List<String>> getMobiles() {
		return mobiles;
	}

	public void setMobiles(HashMap<String, List<String>> mobiles) {
		this.mobiles = mobiles;
	}

	public MobileOperations(HashMap<String, List<String>> mobiles) {
		super();
		this.mobiles = mobiles;
	}
	
	
	
	@Override
	public String toString() {
		return "MobileOperations [mobiles=" + mobiles + "]";
	}

	HashMap<String, List<String>> addMobile(String brand,String model){
		/*Map.Entry<String, List<String>> entry = availMob.entrySet().stream()
                .filter(mapEntry -> brand.equals(mapEntry.getKey()))
                .findAny();*/
		
		if(this.mobiles.containsKey(brand)) {
			this.mobiles.get(brand).add(model);
		}else {
			List<String> md=new ArrayList<String>();
			md.add(model);
			this.mobiles.put(brand,md);
		}
		return this.mobiles;
	}

public void  searchMobile(String brand){
	if(this.mobiles.containsKey(brand)) {
		System.out.println("found brand "+brand+" Model "+this.mobiles.get(brand));
	}else {
		System.out.println(brand+" Does not exist");
	}
	}

public void  buyMobile(String brand,String model){
	if(this.mobiles.containsKey(brand)) {
		if(this.mobiles.get(brand).contains(model)) {
			this.mobiles.get(brand).remove(model);
			System.out.println("You bought brand "+brand+" model "+model);
		}else {
			System.out.println(brand+" of model "+model+" Does not exist");
		}
	}else {
		System.out.println(brand+" you want to buy  Does not exist");
	}
	}
	

}
