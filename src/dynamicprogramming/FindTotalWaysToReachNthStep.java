package dynamicprogramming;

public class FindTotalWaysToReachNthStep {

	public static void main(String[] args) {
		// 1. normal recursive solution
		// T(n) = T(n-1)+T(n-2)+T(n-3)
		// T(0) = 1; T(1)=2; T(2) = 2
		int stairs = 4;

		int steps = getSteps(stairs);
		System.out.println("Total no of ways to reach stairs :: " + stairs + " is :: " + steps);

		// Top - Down - Memoization
		int td_steps = getStepsTD(stairs, new int[stairs + 1]);
		System.out.println("Top Down - Total no of ways to reach stairs :: " + stairs + " is :: " + td_steps);

		// Bottom - UP - Tabulation
		int bu_steps = getStepsBUP(stairs);
		System.out.println("Bottom up - Total no of ways to reach stairs :: " + stairs + " is :: " + bu_steps);

		// Bottom - UP - Tabulation - Simplified
		int sbu_steps = getStepsSimpBUP(stairs);
		System.out.println("Simplified Bottom up - Total no of ways to reach stairs :: " + stairs + " is :: " + sbu_steps);

	}

	private static int getSteps(int n) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}

		return getSteps(n - 1) + getSteps(n - 2) + getSteps(n - 3);
	}

	// Top - Down

	private static int getStepsTD(int n, int[] dp) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}

		if (dp[n] == 0) {
			dp[n] = getStepsTD(n - 1, dp) + getStepsTD(n - 2, dp) + getStepsTD(n - 3, dp);
		}

		return dp[n];
	}

	private static int getStepsBUP(int n) {
		int[] lk = new int[n + 1];
		lk[0] = 1;
		lk[1] = 1;
		lk[2] = 2;

		for (int i = 3; i <= n; i++) {
			lk[i] = lk[i - 1] + lk[i - 2] + lk[i - 3];
		}

		return lk[n];
	}
	
	private static int getStepsSimpBUP(int n) {
		int a = 1;
		int b = 1;
		int c = 2;

		for (int i = 3; i <= n; i++) {
			int result = a+b+c;
			a= b;
			b = c;
			c = result;
		}

		return c;
	}

}
