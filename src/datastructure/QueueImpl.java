package datastructure;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {
		Queue<Integer> qv = new LinkedList<>();

		// Add the value
		qv.add(1);
		qv.add(2);

		// print

		System.out.println(qv);

		// No - we can't Add at sepcific location
		qv.add(3);

		System.out.println(qv);

		// remove the first value
		System.out.println(qv.poll());

		// get the first value
		System.out.println(qv.peek());

		System.out.println(qv);
		System.out.println("-----------------------------End of Queue with linked list ----------------");

		System.out.println("----------------------------Start of Queue with ArrayDequeue --------------");
		ArrayDeque<Integer> adq = new ArrayDeque<>();

		// Add the value
		adq.add(1);
		adq.add(2);

		// print

		System.out.println(adq);

		// No - we can't Add at specific location
		adq.add(3);

		System.out.println(adq);

		// remove the first value
		System.out.println(adq.poll());

		// get the first value
		System.out.println(adq.peek());

		System.out.println(adq);

		// Add the value
		adq.add(5);
		adq.add(6);

		System.out.println(adq);
		System.out.println();
		// add the value at first
		adq.addFirst(7);
		System.out.println(adq);

		// add the value at last
		adq.addLast(9);
		System.out.println(adq);
		
		//poll from the last
		System.out.println(adq.pollLast());
		
		System.out.println(adq);
		
		//poll from the last
		System.out.println(adq.pollFirst());
		
		System.out.println(adq);
		
		//peek from first
		System.out.println(adq.peekFirst());
		
		//peek from Last
		System.out.println(adq.peekLast());
		
		System.out.println(adq);
		
		//peek
		System.out.println(adq.peekFirst());
		
		adq.addFirst(1);
		adq.addLast(1);
		
		System.out.println(adq);
		
		adq.removeFirstOccurrence(1);
		System.out.println(adq);
		
		adq.removeLastOccurrence(1);
		
		System.out.println(adq);

	}

}
