package dynamicprogramming;

import java.util.HashMap;

public class FindSubArrayOfTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,6,10};
		int total = 16;
		
		System.out.println(counts(arr,total, arr.length-1));
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.println(counts_mem(arr,total, arr.length-1,hm));

	}

	public static int counts(int[] arr, int total, int i) {
		if(total == 0) {
			return 1;
		}
		else if(total < 0) {
			return 0;
		} else if(i < 0) {
			return 0;
		} else if(total < arr[i]) {
			return counts(arr, total, i-1);
		}
		else {
			return counts(arr, total-arr[i], i-1)+counts(arr, total, i-1);	
		}
	}
	
	public static int counts_mem(int[] arr, int total, int i, HashMap<String, Integer> hm) {
		
		String key = total +":"+i;
		
		Integer result = 0;
		
		if(hm.get(key) != null) {
			return hm.get(key);
		}
		
		if(total == 0) {
			return 1;
		}
		else if(total < 0) {
			return 0;
		} else if(i < 0) {
			return 0;
		} else if(total < arr[i]) {
			result =  counts_mem(arr, total, i-1, hm);
		}
		else {
			result =  counts_mem(arr, total-arr[i], i-1,hm)+counts_mem(arr, total, i-1,hm);	
		}
		
		hm.put(key, result);
		
		return hm.get(key);
	}
}
