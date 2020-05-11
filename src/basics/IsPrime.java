package basics;

import java.util.ArrayList;

public class IsPrime {

	public static void main(String[] args) {
		int x =7*11;
		
		if(x%2 ==0 || x%3==0 || x%5==0) {
			System.out.println("Not Prime");
			return;
		}
		
		int n = (int) Math.sqrt(x);
		int i = 5;
		boolean isNotPrime = false;
		while(i <= n) {
			if(x%i == 0) {
				System.out.println("Not Prime");
				isNotPrime = true;
				break;
			}
			i +=2;
		}
		
		if(!isNotPrime)
		System.out.println("Prime");
		
		System.out.println(isPrime(239));
		
		ArrayList<Integer> primes = new ArrayList<>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		
		int k=6;
		while(primes.size() <=26) {
			if(isPrime(k)) {
				primes.add(k);
			}
			k++;
		}
		
		System.out.println(primes);

	}
	
	
	static boolean isPrime(int n) {
		
		if(n<=1) return false;
		if(n<=3) return true;
		
		if (n % 2 == 0 || n % 3 == 0) return false; 
		
		for(int i=5; i*i<n; i= i+6) {
			if(n%i ==0 || n%(i+2) == 0) {
				return false;
			}
		}
		
		return true;
	}

}
