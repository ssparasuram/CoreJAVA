package hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 1, 5, 3, 2 };
		int n = arr.length;
		int[][] queries = { { 1, 3, 10 }, { 4, 5, 5 }, { 1, 2, 10 }, { 2, 5, 5 } };

		long max_v = Integer.MIN_VALUE;
		int row = queries.length;
		for (int i = 0; i < row; i++) {
			arr[queries[i][0] - 1] += queries[i][2];
			if (n > queries[i][1])
				arr[queries[i][1]] -= queries[i][2];
		}
		max_v = arr[0];
		for (int u = 1; u < n; u++) {
			arr[u] += arr[u - 1];
			if (max_v < arr[u]) {
				max_v = arr[u];
			}
		}

		System.out.println(max_v);
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		
		int[] arrb = {2, 3, 4, 2, 3, 6, 8, 4, 5};
		
		int[] frq = new int[201];
		
		for(int y=0; y< 5; y++){
            frq[arrb[y]] ++;
        }
		
		getMedian(frq, 5);

	}

	static long arrayManipulation(int n, int[][] queries) {
		int[] arr = new int[n];
		long max_v = Integer.MIN_VALUE;
		int row = queries.length;
		for (int i = 0; i < row; i++) {
			arr[queries[i][0] - 1] += queries[i][2];
			if (n > queries[i][1])
				arr[queries[i][1]] -= queries[i][2];
		}
		max_v = arr[0];
		for (int u = 1; u < n; u++) {
			arr[u] += arr[u - 1];
			if (max_v < arr[u]) {
				max_v = arr[u];
			}
		}

		return max_v;

	}
	
	
	static int  getMedian(int[]frq, int d ){
        float median = 0;
        int first = d/2;
        int second = (d/2)+1;
        System.out.println(Arrays.stream(frq).boxed().collect(Collectors.toList()));
        boolean isOdd = d%2==0?true:false;
        
        if(isOdd) {
        	first +=1; 
        }
        for(int r=0; r<201; r++){
            if(isOdd){
                first -=(frq[r]);
                if(first <= 0){
                    median = r;
                    break;
                }
            } else {
                first -=(frq[r]);
                second -= (frq[r]);
                if(first <= 0){
                    median = r;
                }
                if(second <= 0){
                    median += r;
                    median = (float) (median) / 2;
                    break;
                }
            }
        }


        return (int)median;
    }

}
