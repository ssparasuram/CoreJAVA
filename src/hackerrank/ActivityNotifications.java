package hackerrank;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ActivityNotifications {

	// Complete the activityNotifications function below.
	static int activityNotifications(int[] expenditure, int d) {
		int notification = 0;

		int i = d;
		float median = 0;
		int[] frq = new int[201];

		for (int y = 0; y < d; y++) {
			frq[expenditure[y]]++;
		}

		while (i < expenditure.length) {
			median = getMedian_3(frq, d);
			/*
			if (expenditure[i] >= (int) (2 * median)) {
				notification += 1;
			}*/
			
			if (d % 2 == 0) {
	            if (expenditure[i] >= median) {
	            	notification++;
	            	System.out.println(median);
	            }
	        } else {
	            if (expenditure[i] >= 2 * median)
	            	notification++;
	        }
			
			frq[expenditure[i]]++;
			frq[expenditure[i - d]]--;
			i++;
		}

		return notification;

	}
	
	public static int getMedian(int freq[],int d){
	    int prefix_sum[] = new int[201];
	    prefix_sum[0] = freq[0];
	    for(int i=1;i<201;i++){
	        prefix_sum[i] = prefix_sum[i-1] + freq[i];
	    }
	    int median;
	    int a = 0;
	    int b = 0;
	    if(d%2==0){
	        int first = d/2;
	        int second = first+1;
	        int i = 0;
	        for(;i<201;i++){
	            if(first<=prefix_sum[i]){
	                a = i;
	                break;
	            }
	        }
	        for(;i<201;i++){
	            if(second<=prefix_sum[i]){
	                b = i;
	                break;
	            }
	        }

	    }else{
	        int first = d/2 + 1;
	        for(int i=0;i<201;i++){
	            if(first<=prefix_sum[i]){
	                a = i;
	                break;
	            }
	        }
	    }
	    median = a + b;
	    
	    return median;
	}



	static int getMedian_3(int[] frq, int d) {
		float firstmedian = 0;
		float secondmedian = 0;
		
		int first = d / 2;
		int second = first + 1;

		boolean isOdd = d % 2 == 0 ? false : true;

		if (isOdd) {
			first = second;
		}
		
		int prefix_sum[] = new int[201];
	    prefix_sum[0] = frq[0];
	    for(int i=1;i<201;i++){
	        prefix_sum[i] = prefix_sum[i-1] + frq[i];
	    }
	    

		for (int r = 0; r < 201; r++) {
			if (isOdd) {
				if (first <= prefix_sum[r]) {
					firstmedian = r;
					break;
				}
			} else {
				if (first <= prefix_sum[r] && firstmedian ==0) {
					firstmedian = r;
				}
				if (second <= prefix_sum[r]) {
					secondmedian = r;
					break;
				}
			}
		}
		return (int) (firstmedian+secondmedian);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		Scanner sc = new Scanner(new File("C:\\Users\\paras\\Documents\\kpjava\\textcase.txt"));
		while (sc.hasNext()) {
			String[] nd = sc.nextLine().split(" ");

			int n = Integer.parseInt(nd[0]);

			int d = Integer.parseInt(nd[1]);

			int[] expenditure = new int[n];

			String[] expenditureItems = sc.nextLine().split(" ");
			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int expenditureItem = Integer.parseInt(expenditureItems[i]);
				expenditure[i] = expenditureItem;
			}

			int result = activityNotifications(expenditure, d);

			System.out.println(result);

			// bufferedWriter.write(String.valueOf(result));
			// bufferedWriter.newLine();

			// bufferedWriter.close();

			//scanner.close();
		}
		sc.close();
	}
}
