package com.suda.sealed;

public non-sealed class Aeroplane implements Vehicle {
	
	public static void main(String[] args) {
		Aeroplane plane=new Aeroplane();
		plane.weels();
		plane.engine();
		Bus bus=new Bus();
		bus.weels();
		bus.engine();
	}
	

	@Override
	public void weels() {
		System.out.println("Aeroplane has 3 weels");

	}

	@Override
	public void engine() {
		System.out.println("Aeroplane has 2 engines");

	}

}
