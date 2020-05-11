package dynamicprogramming;

import java.util.HashMap;

public class MinimumRemovalForStringPalindrome {

	public static void main(String[] args) {
		/**
		 * T = Aoppai From T we need to check i and j position , Where i and j are the
		 * pointers of front and rear. T[i] == T[j] then we can move the i+1 and j-1
		 * otherwise we have tow option 1. move i and keep j => T[i+1] T[j] 2. keep i
		 * and move j => T[i] T[j-1 then take the maximum value from these two branches
		 * 
		 * 1. We can apply the recursion and DP to solve (Optimal structure -> doing the
		 * same work again and again)
		 */

		String T = "ACBCDBAA";
		int countFromRecursion = recursiveRemovalCountForPalindrome(T, 0, T.length() - 1);
		System.out.println(
				"Recursive :: minimum count of char remove for making String into palindrome :: " + countFromRecursion);

		HashMap<String, Integer> hm = new HashMap<>();
		int countFromDPTopDown = dpRemovalCountForPalindrome(T, 0, T.length() - 1, hm);
		System.out.println(
				"DP :: minimum count of char remove for making String into palindrome :: " + countFromDPTopDown);

		int countFromDPLookup = dpTabRemovalCountForPalindrome(T);
		System.out.println(
				"DP lookup :: minimum count of char remove for making String into palindrome :: " + countFromDPLookup);

	}

	private static int recursiveRemovalCountForPalindrome(String t, int i, int j) {
		// base
		if (t.length() < 1) {
			return 0;
		}
		if (i > j) {
			return 0;
		}

		if (t.charAt(i) == t.charAt(j)) {
			return recursiveRemovalCountForPalindrome(t, i + 1, j - 1);
		} else {
			// +1 (for remove operation)
			return 1 + Math.min(recursiveRemovalCountForPalindrome(t, i, j - 1),
					recursiveRemovalCountForPalindrome(t, i + 1, j));
		}
	}

	private static int dpRemovalCountForPalindrome(String t, int i, int j, HashMap<String, Integer> hm) {
		// base
		if (t.length() < 1) {
			return 0;
		}
		if (i > j) {
			return 0;
		}
		String key = i + "-" + j;
		if (hm.get(key) == null) {
			if (t.charAt(i) == t.charAt(j)) {
				return dpRemovalCountForPalindrome(t, i + 1, j - 1, hm);
			} else {
				// +1 (for remove operation)
				int count = 1 + Math.min(dpRemovalCountForPalindrome(t, i, j - 1, hm),
						dpRemovalCountForPalindrome(t, i + 1, j, hm));

				hm.put(key, count);
			}

		}
		return hm.get(key);
	}

	private static int dpTabRemovalCountForPalindrome(String t) {
		// base
		if (t.length() < 1) {
			return 0;
		}

		int n = t.length();
		int[][] lk = new int[n + 1][n + 1];
		String R = new StringBuilder(t).reverse().toString();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (t.charAt(i-1) == R.charAt(j-1)) {
					lk[i][j] = lk[i - 1][j - 1] + 1;
				} else {
					lk[i][j] = Math.max(lk[i - 1][j], lk[i][j - 1]);
				}
			}
		}

		return n - lk[n][n];
	}

}
