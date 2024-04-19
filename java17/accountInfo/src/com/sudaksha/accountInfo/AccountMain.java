package com.sudaksha.accountInfo;

import com.sudaksha.customerInfo.Customer;

public class AccountMain {
	
public static void main(String[] args) {
	Account account=new Account();
	account.setAcno(111111L);
	account.setBalance(5000);
	Customer customer=new Customer();
	customer.setCustId(12);
	customer.setCustName("Uwimana");
	customer.setCustEmail("uwimana@gmail.com");
	account.setCustomer(customer);
	
	System.out.println(account.getAcno()+" "+account.getBalance());
	System.out.println(account.getCustomer().getCustId()+" "+account.getCustomer().getCustName()+" "+account.getCustomer().getCustEmail());
	
}

}
