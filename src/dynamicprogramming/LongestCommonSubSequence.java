package dynamicprogramming;

import java.util.HashMap;

public class LongestCommonSubSequence {

	// https://www.techiedelight.com/longest-common-subsequence/
	public static void main(String[] args) {
		// find the common sub sequence from given two string

		// if X[i-1] == y[j-1] == > lcs(x[i...n]y[j..m]) = lcs(x[i...n-1]y[j..m-1])+1;
		// else
		// lcs(x[i...n]y[j..m]) = max( lcs(x[i...n]y[j..m-1]), lcs(x[i...n-1]y[j..m]))

		String X = "ABCBDAB";
		String Y = "BDCABA";
		int n = X.length();
		int m = Y.length();
		int longestCommonSubSequence = 0;
		// Recursive function
		longestCommonSubSequence = recursiveLCS(X, Y, n, m);

		System.out.println("Recursive :: longestCommonSubSequence :: " + longestCommonSubSequence);

		// Memoization (Top - down)
		HashMap<String, Integer> hm = new HashMap<>();
		longestCommonSubSequence = memoizationLCS(X, Y, n, m, hm);
		System.out.println("Memoization :: longestCommonSubSequence :: " + longestCommonSubSequence);

		// Tabulation(bottom up)
		longestCommonSubSequence = tabulationLCS(X, Y, n, m);
		System.out.println("Tabulation :: longestCommonSubSequence :: " + longestCommonSubSequence);

		// Space optimized Tabulation(bottom up)
		if (X.length() > Y.length()) {
			longestCommonSubSequence = tabulationSpacceOptimizedLCS(X, Y, n, m);
		} else {
			longestCommonSubSequence = tabulationSpacceOptimizedLCS(Y, X, m, n);
		}

		System.out.println("Tabulation space :: longestCommonSubSequence :: " + longestCommonSubSequence);
	}

	private static int tabulationLCS(String x, String y, int n, int m) {

		if (n == 0 || m == 0) {
			return 0;
		}

		int[][] lk = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (x.charAt(i - 1) == y.charAt(j - 1)) {
					lk[i][j] = lk[i - 1][j - 1] + 1;
				} else {
					lk[i][j] = Math.max(lk[i - 1][j], lk[i][j - 1]);
				}
			}
		}

		return lk[n][m];
	}

	private static int memoizationLCS(String x, String y, int n, int m, HashMap<String, Integer> hm) {
		if (n == 0 || m == 0) {
			return 0;
		}
		String key = n + "-" + m;
		if (hm.get(key) == null) {
			if (x.charAt(n - 1) == y.charAt(m - 1)) {
				hm.put(key, memoizationLCS(x, y, n - 1, m - 1, hm) + 1);
			} else {
				int value = Integer.max(memoizationLCS(x, y, n - 1, m, hm), memoizationLCS(x, y, n, m - 1, hm));

				hm.put(key, value);
			}
		}
		return hm.get(key);
	}

	private static int recursiveLCS(String x, String y, int n, int m) {
		if (n == 0 || m == 0) {
			return 0;
		}

		if (x.charAt(n - 1) == y.charAt(m - 1)) {
			return recursiveLCS(x, y, n - 1, m - 1) + 1;
		}

		return Math.max(recursiveLCS(x, y, n - 1, m), recursiveLCS(x, y, n, m - 1));

	}

	private static int tabulationSpacceOptimizedLCS(String x, String y, int n, int m) {

		if (n == 0 || m == 0) {
			return 0;
		}

		int[] lk = new int[m + 1];
		int prev;

		for (int i = 0; i <= n; i++) {
			prev = lk[0];
			for (int j = 0; j <= m; j++) {
				if (i == 0 || j == 0) {
					lk[j] = 0;
				} else {
					int backup = lk[j];
					if (x.charAt(i - 1) == y.charAt(j - 1)) {
						lk[j] = prev + 1;
					} else {
						lk[j] = Math.max(lk[j - 1], lk[j]);
					}
					prev = backup;
				}
			}
		}

		return lk[m];
	}
}
