package threads;

class MyThread extends Thread {
	MyThread() {
		System.out.print(" MyThread");
	}

	public void run() {
		System.out.print(" bar");
	}

	public void run(String s) {
		System.out.println(" baz");
	}
}

public class ThreadDemo extends Thread {

	/*
	 * public static void main(String[] args) {
	 * 
	 * Thread t = new MyThread() { public void run() { System.out.println(" foo"); }
	 * }; t.start();
	 * 
	 * ThreadDemo t = new ThreadDemo(); t.start(); System.out.print("one. "); new
	 * ThreadDemo(new RunnableDemo()).start(); System.out.print("two. "); }
	 * 
	 * public void run() { System.out.print("Thread "); } ThreadDemo(){
	 * 
	 * }
	 * 
	 * ThreadDemo(Runnable r) {super(r); }
	 * 
	 */

	private int x = 0;
	private int y = 0;

	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		(new Thread(obj)).start(); /* Line 8 */
		(new Thread(obj)).start(); /* Line 8 */
	}

	public synchronized void run () /*Line 11*/
	{
		for (int i=0;i<10;i++) /*Line 13*/
		{
		  x++;
		  y++;
		 System.out.println("x = " +x+" ; y = "+y);
		}
	}
}

class RunnableDemo implements Runnable {
	public void run() {
		System.out.print(" Inside Runnable");
	}
}
