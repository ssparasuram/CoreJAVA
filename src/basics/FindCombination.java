package basics;

import java.util.Scanner;

public class FindCombination {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Value of sum :");
		if (scanner.hasNextLong()) {
			long sum = scanner.nextLong();

			long noOfWays = findCombincation(sum);

			System.out.println("No of Ways :: " + noOfWays);
		}
		scanner.close();

	}

	
	/**
	 * For Given value of sum find the combination with 1 and 2
	 * 
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
	static long findCombincation(long sum) {
		long noOfWays = 0l;
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
