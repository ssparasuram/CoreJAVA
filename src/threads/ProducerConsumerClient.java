package threads;

import java.util.ArrayList;

public class ProducerConsumerClient {
	//https://howtodoinjava.com/java/multi-threading/wait-notify-and-notifyall-methods/

	public static void main(String[] args) {
		
		ArrayList<Integer> products = new ArrayList<>();
		Integer MAX_SIZE = 5;
		
		Thread t = new Thread(new Producer(products, MAX_SIZE));
		Thread t1 = new Thread(new Consumer(products));
		
		t.start();
		t1.start();
		

	}

}
