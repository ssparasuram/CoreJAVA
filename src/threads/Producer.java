package threads;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable{
	
	private final List<Integer> products;
	int maxSize;
	
	public Producer(ArrayList<Integer> products2 , int maxSize) {
		this.products = products2;
		this.maxSize = maxSize;
	}

	
	@Override
	public void run() {
		int count = 0;
		
		while(true) {
			try {
				produce(count++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void produce(int i) throws InterruptedException {
		
		synchronized (products) {
			
			while(products.size() == maxSize) {
				System.out.println("More products produced"+ Thread.currentThread().getName()+ " is waiting "+ "Size :: "+products.size());
				products.wait();
			}
			Thread.sleep(50);
			products.add(i);
			System.out.println(" system produced :: "+i);
			products.notifyAll();
			
		}
		
	}
	
}
