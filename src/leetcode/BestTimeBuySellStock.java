package leetcode;

public class BestTimeBuySellStock {
	// https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3287/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {

		if (prices.length < 1) {
			return 0;
		}
		int profit = 0;
		int curr_low = prices[0];
		int curr_high = prices[0];

		for (int price : prices) {
			if (curr_high <= price) {
				curr_high = price;
			} else {
				profit += curr_high - curr_low;
				curr_low = price;
				curr_high = price;
			}
		}
		profit += curr_high - curr_low;

		return profit;

	}

}
