package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class CountOfElements {

	//https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3289/
	public static void main(String[] args) {
		int[] arr = {1,3,2,3,5,0};
		HashSet<Integer> hSet = Arrays.stream(arr).collect(HashSet :: new, (m,i)-> m.add(i), HashSet::addAll);
		System.out.println(hSet);
		
		int count = (int) Arrays.stream(arr).filter(a-> hSet.contains(a+1)).count();
		
		System.out.println(count);
	}
	

	

}
