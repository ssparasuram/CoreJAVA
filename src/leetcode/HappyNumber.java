package leetcode;

import java.util.HashSet;

public class HappyNumber {

	
	/**
	 * 19
	 * 
	 * 1^2 + 9^2 = 82
	 * 8^2 + 2^2 = 68
	 * 6^2 + 8^2 = 100
	 * 1^2 + 0^ + 0^2 = 1
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 19;
		
		System.out.println(isHappy(a));

	}

	public static boolean isHappy(int n) {

		HashSet<Integer> unique = new HashSet<>();

		while (unique.add(n)) {

			int value = 0;

			while (n > 0) {
				value += Math.pow(n % 10, 2);
				n /= 10;
			}
			n = value;

		}

		return n == 1;
	}

}
