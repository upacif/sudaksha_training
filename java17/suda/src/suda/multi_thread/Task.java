package suda.multi_thread;

public class Task implements Runnable {

	private int taskID;
	
	
	public Task(int taskID) {
		super();
		this.taskID = taskID;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task ID:"+this.taskID+" performed by "+Thread.currentThread().getName());
		
	}

}
