package datastructure;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr1 = {3,7,1,2,5,9,8};
		int[] arr = {1, 2, 3, 5, 7, 8, 9};
		
		List<Integer> l1 = Arrays.stream(bubbleSortOwn(arr1)).boxed().collect(Collectors.toList());

		System.out.println( l1);
	}
	
	public static int[] bubbleSort(int[] arr) {
		
		
		for(int i=0; i< arr.length; i++) {
			for (int j = i; j< arr.length ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
	
	public static int[] bubbleSortAfterTheroy(int[] arr) {
		
		boolean isSorted = false;
		
		while(!isSorted) {
			isSorted = true;
			
			for(int i =1; i< arr.length; i++) {
				if(arr[i-1] > arr[i]) {
					isSorted = false;
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	static int[] bubbleSortOwn(int[] arr) {
		printArr( arr) ;
		for(int i=0; i< arr.length; i++) {
			for(int j=i; j< arr.length; j++) {
				if(arr[i]> arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			printArr( arr) ;
		}
		return arr;
	}
	
	static void printArr(int[] arr) {
		List<Integer> l1 = Arrays.stream(arr).boxed().collect(Collectors.toList());

		System.out.println( l1);
	}

}
