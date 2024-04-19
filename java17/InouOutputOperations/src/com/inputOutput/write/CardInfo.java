package com.inputOutput.write;

import java.io.Serializable;

public class CardInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5603108528478769991L;
	private int cardNumber;
	private int month;
	private int year;
	private int cvv;
	private String name;
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CardInfo(int cardNumber, int month, int year, int cvv, String name) {
		super();
		this.cardNumber = cardNumber;
		this.month = month;
		this.year = year;
		this.cvv = cvv;
		this.name = name;
	}
	public CardInfo() {
		super();
	}
	@Override
	public String toString() {
		return "CardInfo [cardNumber=" + cardNumber + ", month=" + month + ", year=" + year + ", cvv=" + cvv + ", name="
				+ name + "]";
	}
	
	

}
