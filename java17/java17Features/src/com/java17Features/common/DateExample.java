package com.java17Features.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("default date using util.Date:"+new Date());
		LocalDate date1=LocalDate.now();
		System.out.println("default date using LocalDate:"+date1);
		System.out.println("default datetime:"+LocalDateTime.now());
		System.out.println("default date plus 2 days:"+LocalDate.now().plusDays(2));
		System.out.println("default date plus 2 months:"+LocalDate.now().plusMonths(2));
		System.out.println("default date plus 3 years:"+LocalDate.now().plusYears(3));

	}

}
