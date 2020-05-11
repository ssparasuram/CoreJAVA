package leetcode;

public class FindMaxProfit {

	public static void main(String[] args) {
		int[] price = {1, 5,8,9,10,17,17};
		
		int rod = 4;
		
		System.out.println("price profit for rod : "+ rod +" :: "+profit(price, rod ));

	}

	private static Integer profit(int[] price, int n) {
		
		int[] t = new int[n+1];
		
		for ( int i =1; i<= n; i++) {
			
			for(int j=1; j<=i ; j++) {
				t[i] = Integer.max(t[i], price[j-1]+t[i-j]);
			}
		}
		
		return t[n];
		
	}

}
