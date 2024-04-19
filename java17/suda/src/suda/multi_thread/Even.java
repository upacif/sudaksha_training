package suda.multi_thread;

public class Even implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <=10; i++) {
			System.out.println("Even:"+i);
		}
		
	}

}
