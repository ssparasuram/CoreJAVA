package datastructure;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 7, 1, 2, 5, 9, 8 };

		List<Integer> l1 = Arrays.stream(selectionSortAfterTheory(arr)).boxed().collect(Collectors.toList());

		System.out.println(l1);
	}

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int minid = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[minid]) {
					minid = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minid];
			arr[minid] = temp;
		}

		return arr;
	}

	public static int[] selectionSortAfterTheory(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int minId = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minId] > arr[j]) {
					minId = j;
				}
			}
			if (i != minId) {
				int temp = arr[minId];
				arr[minId] = arr[i];
				arr[i] = temp;
			}
		}

		return arr;
	}
}
