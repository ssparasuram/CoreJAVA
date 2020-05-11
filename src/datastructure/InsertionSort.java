package datastructure;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 7, 1, 2, 5, 9, 8 };

		List<Integer> l1 = Arrays.stream(insertSortOwn(arr)).boxed().collect(Collectors.toList());

		System.out.println(l1);
	}

	public static int[] insertionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
	
	public static int[] insertSortAfterTherory(int[] arr) {
		
		for(int i=0; i < arr.length; i++) {
			int unsortedElement = arr[i];
			int j= i-1;
			while( j>=0 && unsortedElement < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = unsortedElement;
		}
		
		return arr;
	}
	
	
	static int[] insertSortOwn(int[] arr) {
		
		for(int i=0; i< arr.length; i++) {
			int current = arr[i];
			
			int j = i-1;
			
			while(j >= 0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j--;
			}
			if(i!= j) {
				arr[j+1] = current;
			}
		}
		
		
		return arr;
		
	}
}
