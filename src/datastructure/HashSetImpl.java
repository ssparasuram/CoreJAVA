package datastructure;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetImpl {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();
		// add
		hs.add(1);
		hs.add(2);

		System.out.println(hs);

		// add duplicate

		hs.add(1);

		System.out.println(hs);

		hs.remove(1);
		System.out.println(hs);
		hs.add(1);
		hs.add(3);
		hs.add(5);
		System.out.println(hs);

		hs.retainAll(Arrays.asList(1, 3));

		System.out.println(hs);

		hs.removeAll(Arrays.asList(1, 3));

		System.out.println(hs);
	}

}
