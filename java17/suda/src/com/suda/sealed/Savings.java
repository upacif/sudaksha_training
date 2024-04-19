package com.suda.sealed;

public non-sealed class Savings extends Account {

	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public static void main(String[] args) {
		Savings savings=new Savings();
		savings.setAcno(1001);
		savings.setBalance(5000);
		savings.setInterestRate(7.5);
		System.out.println(savings.getAcno()+" "+savings.getBalance()+" "+savings.getInterestRate());
	}
}
