package hackerrank;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Stream;

public class HashTableRansomNote {

	public static void main(String[] args) {
		String[] mag = {"give", "me", "one","grand", "today", "night"};
		String[] note = {"give", "one","grand", "today",  "today"};
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		Stream.of(mag).forEach(x -> {ht.putIfAbsent(x,0); ht.put(x,ht.get(x)+1);});
		
		System.out.println(Stream.of(note).anyMatch( y -> isNotWordPresent(ht,y)));
		
		
		
		System.out.println(ht);
		
		
		HashMap<Character,Integer> hm = new HashMap<>();
		String s1 = "Hello";
		boolean common = false;
		char[] s1Chars = s1.toCharArray();
		
		for(char c : s1Chars) {
			hm.put((Character)c, 1);
		}
		
		char[] s2Chars = s1.toCharArray();
		for(char c : s2Chars) {
			
			if(hm.get(c)!= null) {
				common = true;
				break;
			}
		}
		

	}
	
	static boolean isNotWordPresent(Hashtable<String, Integer> ht, String key) {
		
		Integer value = ht.get(key);
		if (value != null) {
			ht.put(key, value - 1);
		}
		return value ==null || value <= 0;
	}
	
	public static<K> void increment(Map<K,Integer> map, K key) {
		map.merge(key, 1, Integer::sum);

		// or use lambda expressions
		// map.merge(key, 1, (a,b) -> a + b);
	}

}
