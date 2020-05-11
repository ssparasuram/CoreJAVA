package datastructure;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetImpl {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		// add
		lhs.add(1);
		lhs.add(2);

		System.out.println(lhs);

		// add duplicate

		lhs.add(1);

		System.out.println(lhs);

		lhs.remove(1);
		System.out.println(lhs);
		lhs.add(1);
		lhs.add(3);
		lhs.add(5);
		System.out.println(lhs);

		lhs.retainAll(Arrays.asList(1, 3));

		System.out.println(lhs);

		lhs.removeAll(Arrays.asList(1, 3));

		System.out.println(lhs);
	}

}
