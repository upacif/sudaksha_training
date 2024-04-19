package com.sudaksha.accountInfo;

import com.sudaksha.customerInfo.Customer;

public class Account {
	private Long acno;
	private double balance;
	private Customer customer;
	public Long getAcno() {
		return acno;
	}
	public void setAcno(Long acno) {
		this.acno = acno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
