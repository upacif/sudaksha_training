package suda.multi_thread;

public class TrainBerthsReservationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainBrthsReservation trainBrthsReservation=new TrainBrthsReservation();
		Thread james=new Thread(trainBrthsReservation);
		james.setName("James");
		Thread uwimana=new Thread(trainBrthsReservation);
		uwimana.setName("Uwimana");
		Thread shukuru=new Thread(trainBrthsReservation);
		shukuru.setName("Shukuru");
		james.start();
		uwimana.start();
		shukuru.start();

	}

}
