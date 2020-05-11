package basics;

import java.util.ArrayList;

public class Test  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(((Double) Math.random()) * 100);

		int[] c = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 };

		// int jum = jumpingOnClouds(c);
		// System.out.println(jum);

		System.out.println(1 / 2 + 1 % 2);
		// System.out.println(repeatedString("a", 1000000000000l));

		// System.out.println("a".substring(0, 2));

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		for (int n : a) {
			System.out.println("For " + n + " :: " + findCombincation(n));
		}
		

	}

	static int jumpingOnClouds(int[] c) {

		int jumps = 0;
		int i = 0;
		while (i < c.length - 1) {
			if (i + 2 == c.length || c[i + 2] == 1) {
				i++;
				jumps++;
			} else {
				jumps += 1;
				i += 2;
			}
		}
		return jumps;

	}

	static long repeatedString(String s, long n) {

		long noOfA = 0l;

		long noOfFullString = n / s.length();
		int remainingChar = (int) n % s.length();

		int countPerString = (int) s.chars().filter(x -> x == 'a').count();

		noOfA += (noOfFullString * countPerString);

		noOfA += (long) s.substring(0, remainingChar).chars().filter(x -> x == 'a').count();

		return noOfA;
	}

	static long findCombincation(long sum) {
		long noOfWays = 0l;

		// find odd or even
		
		/**
		 * no = formula 				= total no of ways
		 * 1 =  1						= 1
		 * 2 =  1+1						= 2
		 * 3 =  1+(n-1) 				= 3
		 * 4 =  1+(n-1)+1				= 5
		 * 5 =  1+(n-1)+(n-2)			= 8
		 * 6 =  1+(n-1)+(n-2)+1			= 11
		 * 7 =  1+(n-1)+(n-2)+(n-3) 	= 16
		 * 8 =  1+(n-1)+(n-2)+(n-3)+1 	= 20
		 * 
		 * For Solving total from n to n-x
		 * sum = n(n+1)/2 - ((n-x)(n-x+1)/2))
		 */

		long half = sum / 2;

		long upperLimit = sum - 1;
		long lowerLimit = 0;

		if (sum % 2 == 0) {
			lowerLimit = sum - half;
			noOfWays = 2 + ((upperLimit * (upperLimit + 1) / 2) - (lowerLimit * (lowerLimit + 1) / 2));
		} else {
			lowerLimit = upperLimit - half;
			noOfWays = 1 + ((upperLimit * (upperLimit + 1) / 2) - (lowerLimit * (lowerLimit + 1) / 2));
		}

		return noOfWays;
	}

}
