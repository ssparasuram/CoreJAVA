package datastructure;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 3, 7, 1, 2, 5, 9, 8,4 };

		quickSortAT(arr, 0, arr.length - 1);

		print(arr);

	}

	private static void print(int[] arr) {
		List<Integer> l1 = Arrays.stream((arr)).boxed().collect(Collectors.toList());

		System.out.println(l1);
	}

	private static void quickSortAT(int[] arr, int left, int right) {

		if ( left < right) {

			int pivotIndex = partition(arr, left, right);

			quickSortAT(arr, left, pivotIndex-1);

			quickSortAT(arr, pivotIndex+1, right);
		}
	}


	private static int partition(int[] arr, int left, int right) {

		int pivotElement = arr[right];
		int l = left-1;
		//int r = right;

		System.out.println("pivot :: " + pivotElement);
		print(arr);
		
		for( int r= left; r<right; r++ ) {
			if(arr[r] < pivotElement) {
				l++;
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				print(arr);
			}
		}
		
		arr[right] = arr[l+1];
		arr[l+1] = pivotElement;
	
		print(arr);
		return l+1;
	}

}
