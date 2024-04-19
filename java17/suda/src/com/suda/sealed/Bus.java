package com.suda.sealed;

public non-sealed class Bus implements Vehicle {

	@Override
	public void weels() {
		System.out.println("Bus has 6 weels");

	}

	@Override
	public void engine() {
		System.out.println("Bus has on engine");

	}

}
