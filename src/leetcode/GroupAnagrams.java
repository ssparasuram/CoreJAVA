package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		List<List<String>> ll = Arrays.stream(strs)
				.collect(Collectors.groupingBy(GroupAnagrams::getSorted)).values().stream().collect(Collectors.toList());
		
		
		System.out.println(ll);
	}
	
	public static String getSorted(String str) {
		char[] ar = str.toCharArray();
		 Arrays.sort(ar);
		 return new String(ar);
		
	}

}
