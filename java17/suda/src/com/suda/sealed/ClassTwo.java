package com.suda.sealed;

public non-sealed class ClassTwo implements Two {
	
	public static void main(String[] args) {
		ClassTwo two=new ClassTwo();
		two.methodTwo();
		two.methodOne();
	}

	@Override
	public void methodTwo() {
		System.out.println("This is methodTwo from Class two");
		
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("This is methodOne from Class two");
	}
	
}
