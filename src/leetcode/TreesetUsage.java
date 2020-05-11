package leetcode;

import java.util.TreeSet;

public class TreesetUsage {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(5);
		ts.add(2);
		
		System.out.println(ts.toArray()[ts.size()-1]);
	}

}
