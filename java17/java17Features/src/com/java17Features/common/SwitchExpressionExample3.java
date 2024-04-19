package com.java17Features.common;

public class SwitchExpressionExample3 {
	
	enum Months{
		JAN,FEB,MAR,APR,MAY,JUNE,JUL,AUG,SEPT,OCT,NOV,DEC;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Months mon=Months.MAR;
		int days=0;
		switch (mon) {
		case FEB->days=28;
		case JAN,MAR,MAY->days=31;
		case APR, JUNE->days=30;
		}
		
		System.out.println("days in month ="+days);
		
		days=switch (mon) {
		case FEB->{yield 28;}
		case JAN,MAR,MAY->{yield 31;}
		case APR, JUNE->{yield 30;}
		default -> throw new IllegalStateException();
		};
		
		System.out.println("days in month ="+days);

	}

}
