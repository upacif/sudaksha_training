package suda.multi_thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CachedThreadPoolExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPoolExecutor pool=(ThreadPoolExecutor) Executors.newCachedThreadPool();
		for (int i = 0; i <=5; i++) {
			FetchDataFromFile fromFile=new FetchDataFromFile("File-"+i);
			System.out.println("A new file has added to read:"+fromFile.getFileName());
			pool.execute(fromFile);	
		}
		pool.shutdown();

	}

}
