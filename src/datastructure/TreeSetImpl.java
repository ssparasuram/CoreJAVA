package datastructure;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		// add
		ts.add(1);
		ts.add(2);

		System.out.println(ts);

		// add duplicate

		ts.add(1);

		System.out.println(ts);

		ts.remove(1);
		System.out.println(ts);
		ts.add(1);
		ts.add(3);
		ts.add(5);

		// get least element
		System.out.println(ts.first());

		// get max element
		System.out.println(ts.last());

		// get head element
		System.out.println("headset " + ts.headSet(3));

		// get head element include the head
		System.out.println("headset  with include " + ts.headSet(3, true));

		// get floor element to given value the head
		System.out.println("floor " + ts.floor(6));
		
		
		System.out.println("Descending order " + ts.descendingSet());

		System.out.println(ts);

		ts.retainAll(Arrays.asList(1, 3));

		System.out.println(ts);

		ts.removeAll(Arrays.asList(1, 3));

		System.out.println(ts);

	}

}
