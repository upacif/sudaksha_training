package com.suda.sealed;

public non-sealed class ClassOne implements One {
	
	public static void main(String[] args) {
		ClassOne one=new ClassOne();
		one.methodOne();
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("From methodOne()");
		
	}
	

}
