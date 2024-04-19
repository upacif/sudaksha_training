package suda.multi_thread;

public class Transactions {
	int balance = 5000;
	synchronized void withdraw(int amonut) {
		System.out.println("Available balance= " + this.balance);
		System.out.println("Trying to withdraw.." + amonut);
		if (this.balance < amonut) {
			System.out.println("Less balance; waiting for deposit");
			try {
				Thread.sleep(6000);
				wait();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.balance = amonut;
		System.out.println("Withdraw completed... balance is:" + this.balance);

	}
	synchronized void deposit(int amount) {
		System.out.println("Trying to deposit.."+amount);
		this.balance+=balance;
		System.out.println("Deposit completed..balance is:"+this.balance);
		notify();
	}
}

 
