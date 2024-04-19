package suda.multi_thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample3 {

	public static void main(String[] args) {
		
		CompletableFuture<Integer> resultFuture=CompletableFuture.supplyAsync(()->10/2)
				.exceptionally(ex->0);
		
		try {
			System.out.println(resultFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
