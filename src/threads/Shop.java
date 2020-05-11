package threads;

import java.util.concurrent.locks.ReentrantLock;

public class Shop implements Runnable {

	private static int count = 0;
	ReentrantLock lock = new ReentrantLock();

	@Override
	public synchronized void run() {
		 lock.lock();
		 
		 Thread t = Thread.currentThread(); 
	        System.out.println("Current thread: "
	                               + t.getName()); 
	  
	        // checks if current thread is alive 
	        System.out.println("Is Alive? "
	                               + t.isAlive()); 
	        
		//synchronized (this) {
			System.out.println("Thead id ::" + Thread.currentThread().getId() + " :: Name :: "
					+ Thread.currentThread().getName()+" :: value :: " + count++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*for (int k = 0; k < 10; k++) {
				
				try {
					this.wait(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
		//}
		lock.unlock();
	}
}
