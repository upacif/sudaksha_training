package suda.multi_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService service =Executors.newFixedThreadPool(20);
		for (int i = 0; i <= 10; i++) {
			service.submit(new Task(i));
		}
service.shutdown();
	}

}
