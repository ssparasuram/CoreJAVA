package datastructure;

import java.util.ArrayList;
import java.util.List;

public class PrimeFacotrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long num = 99L;
		List<Long> factors =  getPrimeFactors(num);
		
		System.out.println(factors);
	}
	
	public static List<Long> getPrimeFactors(long num) {
		List<Long> factors = new ArrayList<>();
		
		//by 2
		Long factor = 2l;
		
		while(num % factor == 0) {
			factors.add(num);
			num /= factor;
		}
		
		factor = 3l;
		int stopAt = (int) Math.sqrt(num);
		
		for(int i = 3; i<Math.sqrt(num) ; i++) {
			if(num%i == 0) {
				factors.add(factor);
				num /= factor;
			}
		}
		
		if(num >= 1) {
			factors.add(num);
		}
		
		
		return factors;
	}

}
