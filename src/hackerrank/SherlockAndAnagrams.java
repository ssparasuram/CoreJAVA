package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SherlockAndAnagrams {
	static int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 25, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
			89, 97, 101 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long data = sherlockAndAnagrams(
				"dichcagakdajjhhdhegiifiiggjebejejciaabbifkcbdeigajhgfcfdgekfajbcdifikafkgjjjfefkdbeicgiccgkjheeiefje");
		System.out.println(data);
	}

	static int sherlockAndAnagrams1(String s) {

		HashMap<Long, String> hm = new HashMap<>();
		HashSet<String> hs = new HashSet<>();

		int w = 1;
		int anagrams = 0;

		for (int i = 0; i < s.length(); i++) {
			hm = new HashMap<>();
			int d = i;
			while (d < s.length() + 1 - w) {
				String sub = s.substring(d, d + w);
				Long hash = getHash(sub);

				if (hm.get(hash) == null) {
					hm.put(hash, sub + "" + d + "-" + w);
				} else {
					if (hs.add("" + d + "-" + w + "-" + hm.get(hash))) {
						anagrams++;
					}
				}
				System.out.println("" + d + " ::" + sub + " ::" + hash + "::" + hm.get(hash) + hs);
				d++;
			}
		}
		String sub = "appa";
		anagrams += "appa".chars().filter(ch-> ch == sub.charAt(sub.length()/2)).count() == 1 ? 1l:0l;

		return anagrams;
	}

	static int sherlockAndAnagrams(String s) {

		HashMap<String, Integer> hm = new HashMap<>();
		int anagrams = 0;
		
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				char[] chars = sub.toCharArray();
				Arrays.sort(chars);
				String hash = String.valueOf(chars);

				int value = hm.getOrDefault(hash, 0);
				if (value > 0) {
					anagrams += value;
				}
				hm.put(hash, ++value);
			}
		}

		return anagrams;
	}

	static Long getHash(String st) {
		Long comp = 1l;
		for (int i = 0; i < st.length(); i++) {
			comp *= primes[st.charAt(i) - 'a'];
		}

		return comp;
	}

}
