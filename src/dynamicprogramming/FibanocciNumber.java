package dynamicprogramming;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FibanocciNumber {

	public static void main(String[] args) {
		//get resursive function
		System.out.println(fib(10));

		// Memoize 
		int n =10;
		int[] mem = new int[n+1];
		System.out.println(fib(n,mem));
		
		
		// bottom up approach
		System.out.println(fib_bottom_up(10) );
	}
	
	public static int fib(int n) {
		int result = 1;
		if(n==1 || n == 2) {
			result =1;
		}
		else {
			result = fib(n-1)+fib(n-2);
		}
		//System.out.print(result + " ");
		return result;
	}
	
	public static int fib(int n, int[] m) {
		
		if(m[n] != 0) {
			return m[n];
		}
		
		if(n ==1  || n ==2) {
			return 1;
		} else {
			int result = fib(n-1, m)+ fib(n-2,m);
			m[n] = result;
		}
		
		return m[n];
		
		
	}
	
	public static int fib_bottom_up(int n) {
		
		if(n == 1 || n == 2) {
			return 1;
		}
		
		int[] m = new int[n+1];
		
		m[0] = 1;
		m[1] =1;
		
		for(int i = 2; i<n; i++) {
			m[i] = m[i-1]+m[i-2];
		}
		
		//System.out.println(Arrays.stream(m).boxed().collect(Collectors.toList()));
		
		return m[n-1];
	}

}
