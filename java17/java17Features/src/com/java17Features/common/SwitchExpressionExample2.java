package com.java17Features.common;

public class SwitchExpressionExample2 {
	
	enum Days{
		MON,TUE,WED,THU,FRI,SAT,SUN
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Days day=Days.FRI;
		switch (day) {
		case MON->System.out.println("Week beginning day");
		case TUE,WED,THU->System.out.println("Working days");
		case FRI,SAT->{System.out.println("weekends");
		int i=5;
		int c=3;
		System.out.println(i+c);
		}
		default ->System.out.println("it is sunday holiday");
		}
		

	}

}
