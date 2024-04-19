package suda.multi_thread;

import java.util.Scanner;

public class TrainBrthsReservation implements Runnable  {

	int availableBerths=10;
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int requiredBerths;
		System.out.println("Welcome "+Thread.currentThread().getName());
		System.out.println("Availble berths:"+availableBerths);
		if(availableBerths>0) {
			System.out.println("Enter berths required:");
			requiredBerths=sc.nextInt();
			if(requiredBerths<=availableBerths) {
				System.out.println("Berthes allowed to "+Thread.currentThread().getName()+":"+requiredBerths);
				availableBerths-=requiredBerths;
			}
		}
		
		
	}

}
