package com.suda.sealed;

public sealed class Account permits Savings,Curent {

	protected int acno;
	protected double balance;
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
