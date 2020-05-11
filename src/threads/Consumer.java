package threads;

import java.util.List;

public class Consumer implements Runnable {
	private final List<Integer> products;

	@Override
	public void run() {
		int count = 0;
		while (true) {
			try {
				consume(count++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public Consumer(List<Integer> products) {
		this.products = products;
	}

	public void consume(int i) throws InterruptedException {
		synchronized (products) {
			while (products.size() == 0) {
				System.out.println("Prodcuts are empty " + Thread.currentThread().getName() + " is waiting "
						+ " size of products :: " + products.size());
				products.wait();
			}
			
			Thread.sleep(1000);
			Number k = products.remove(0);
			System.out.println(" consumed product :: "+k);
			products.notifyAll();
			
		}
	}

}
