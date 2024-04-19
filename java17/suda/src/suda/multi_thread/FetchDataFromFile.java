package suda.multi_thread;

public class FetchDataFromFile implements Runnable {
	private String fileName;
	public FetchDataFromFile(String fileName) {
		this.fileName = fileName;
	}
public String getFileName() {
	return fileName;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Fetching data from :"+fileName+" By "+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
			System.out.println("Read file successfully:"+fileName+" by "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
