package datastructure;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 3, 7, 1, 2, 5, 9, 8 };

		mergeSortAT(arr, 0, arr.length - 1);

		List<Integer> l1 = Arrays.stream((arr)).boxed().collect(Collectors.toList());

		System.out.println(l1);
	}

	public static void mergeSort(int[] arr, int l, int r) {

		if (l < r) {

			int m = (l + r) / 2;

			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			merge(arr, l, m, r);
		}

	}

	private static void merge(int[] arr, int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[m + 1 + j];
		}

		int k = 0;
		int j = 0;

		int i = l;
		while (j < n1 && k < n2) {
			if (L[j] >= R[k]) {
				arr[i] = R[k];
				k++;
			} else {
				arr[i] = L[j];
				j++;
			}
			i++;
		}
		while (j < n1) {
			arr[i] = L[j];
			j++;
			i++;
		}
		while (k < n2) {
			arr[i] = R[k];
			k++;
			i++;
		}

		// return arr;
	}
	
	public static void mergeSortAT(int[] arr, int l, int r) {
		if(l<r) {
			int m = (l+r)/2;
			
			mergeSortAT(arr,l, m );
			mergeSortAT(arr,m+1, r );
			
			mergeAT(arr, l, m ,r); 
		}
		
	}

	private static void mergeAT(int[] arr, int l, int m, int r) {
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		//Form the sub array
		
		for(int i=0; i< n1; i++) {
			left[i] = arr[l+i];
		}
		for(int j=0; j< n2; j++) {
			right[j] = arr[m+1+j];
		}
		
		//check for merge two full list
		int p=0;
		int q=0;
		int s =l;
		while(p < n1 && q<n2) {
			if(left[p]>= right[q]) {
				arr[s] = right[q];
				q++;
			} else {
				arr[s] = left[p];
				p++;
			}
			s++;
		}
		
		while(p< n1) {
			arr[s] = left[p];
			p++;
			s++;
		}
		while(q< n2) {
			arr[s] = right[q];
			q++;
			s++;
		}
		
	}
}
