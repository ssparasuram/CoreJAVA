package dynamicprogramming;

import java.util.HashMap;

public class LongestCommonSubSequenceWithKSeq {

	// https://www.techiedelight.com/longest-common-subsequence-of-k-sequences/
	public static void main(String[] args) {
		// find the common sub sequence from given two string

		// if X[i-1] == y[j-1] == z[k-1] == > lcs(x[1...n]y[1..m]) =
		// lcs(x[1...n-1]y[1..m-1]z[1...o-1])+1;
		// else
		// lcs(x[1...n]y[1..m]z[1...o) = max( lcs(x[1...n]y[1..m]z[1...o-1]),
		// lcs(x[1...n]y[1..m-1]z[1...o]), lcs(x[1...n-1]y[1..m]z[1...o]))

		String X = "ABCBDAB";
		String Y = "BDCABA";
		String Z = "BADACB";
		int n = X.length();
		int m = Y.length();
		int o = Y.length();
		int longestCommonSubSequence = 0;
		// Recursive function
		longestCommonSubSequence = recursiveLCS(X, Y, Z, n, m, o);

		System.out.println("Recursive :: longestCommonSubSequence :: " + longestCommonSubSequence);

		// Memoization (Top - down)
		HashMap<String, Integer> hm = new HashMap<>();
		longestCommonSubSequence = memoizationLCS(X, Y, Z, n, m, o, hm);
		System.out.println("Memoization :: longestCommonSubSequence :: " + longestCommonSubSequence);

		// Tabulation(bottom up)
		longestCommonSubSequence = tabulationLCS(X, Y, Z, n, m, o);
		System.out.println("Tabulation :: longestCommonSubSequence :: " + longestCommonSubSequence);

	}

	private static int tabulationLCS(String x, String y, String z, int n, int m, int o) {

		if (n == 0 || m == 0 || o == 0) {
			return 0;
		}

		int[][][] lk = new int[n + 1][m + 1][o + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				for (int k = 1; k <= o; k++) {
					if (x.charAt(i - 1) == y.charAt(j - 1) && y.charAt(j - 1) == z.charAt(k - 1)) {
						lk[i][j][k] = lk[i - 1][j - 1][k-1] + 1;
					} else {
						lk[i][j][k] = Math.max(Math.max(lk[i - 1][j][k], lk[i][j - 1][k]) ,lk[i][j][k-1]);
					}
				}
			}
		}

		return lk[n][m][o];
	}

	private static int memoizationLCS(String x, String y, String z, int n, int m, int o, HashMap<String, Integer> hm) {
		if (n == 0 || m == 0 || o == 0) {
			return 0;
		}
		String key = n + "-" + m + "-" + o;
		if (hm.get(key) == null) {
			if (x.charAt(n - 1) == y.charAt(m - 1)) {
				hm.put(key, memoizationLCS(x, y, z, n - 1, m - 1, o - 1, hm) + 1);
			} else {
				int value = Integer.max(
						Integer.max(memoizationLCS(x, y, z, n - 1, m, o, hm), memoizationLCS(x, y, z, n, m - 1, o, hm)),
						memoizationLCS(x, y, z, n, m, o - 1, hm));

				hm.put(key, value);
			}
		}
		return hm.get(key);
	}

	private static int recursiveLCS(String x, String y, String z, int n, int m, int o) {
		if (n == 0 || m == 0 || o == 0) {
			return 0;
		}

		if (x.charAt(n - 1) == y.charAt(m - 1) && y.charAt(m - 1) == z.charAt(o - 1)) {
			return recursiveLCS(x, y, z, n - 1, m - 1, o - 1) + 1;
		}

		return Math.max(Math.max(recursiveLCS(x, y, z, n - 1, m, o), recursiveLCS(x, y, z, n, m - 1, o)),
				recursiveLCS(x, y, z, n, m, o - 1));

	}

}
