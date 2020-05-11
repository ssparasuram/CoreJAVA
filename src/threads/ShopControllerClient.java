package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShopControllerClient {
	
	//https://dzone.com/articles/java-concurrency-multi-threading-with-executorserv
	//https://dzone.com/articles/executorservice-10-tips-and

	public static void main(String[] args) throws InterruptedException {
		
		/*
		ExecutorService executor1 = Executors.newSingleThreadScheduledExecutor();
		ExecutorService executor = Executors.newCachedThreadPool();
		ExecutorService executor2 = Executors.newFixedThreadPool(3);
		
		for(int y=0; y< 10; y++) {
			executor.execute(new Thread(new Shop(), "T - "+y));
			
		}
		executor.shutdown();
		
		try {
	        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
	    } catch (InterruptedException e) {
	    }
		
		//System.out.println(Shop.);
		
		
		
		*/
		
		for (int y = 0; y < 5; y++) {
			Thread t = new Thread(new Shop(), "T1 - "+y);
			
			t.start();
			
			Thread.yield();
			
			t.join(1000);
			
			System.out.println("Calling Thread :: "+ t.getName());
			
			System.out.println("isAlive ::"+ t.isAlive());
			
		}
		
	}
}
