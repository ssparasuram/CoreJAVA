package creackingcodinginterview.arraysandstring;

public class InplaceArrayRotation {

	public static void main(String[] args) {
		int n = 4;

		int[][] arr = { { 1, 2, 3 ,4}, {  5, 6,7,8 }, { 9,10,11,12 },  { 13,14,15,16 } };
		
		for (int k = 0; k < n; k++) {
			System.out.println(" | "+arr[k][0] + " " + arr[k][1] + " " + arr[k][2] +" "+   arr[k][3]+" | ");
		}

		arrayRotationWithNewArray(n, arr);
		
		int[][] arrb = { { 1, 2, 3 ,4}, {  5, 6,7,8 }, { 9,10,11,12 },  { 13,14,15,16 } };
		arrayRotationInplace(n, arrb);
	}

	private static void arrayRotationWithNewArray(int n, int[][] arr) {
		int[][] arrb = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arrb[j][n - 1 - i] = arr[i][j];
			}
		}
		System.out.println("After 90 degreee rotation :: ");
		for (int k = 0; k < n; k++) {
			System.out.println(" | "+arrb[k][0] + " " + arrb[k][1] + " " + arrb[k][2] +" "+   arrb[k][3] + " | ");
		}
	}
	
	private static void arrayRotationInplace(int n, int[][] arr) {

		for (int l = 0; l < (n/2); l++) { // layers

			int first = l;
			int last = n-1- l;

			for (int i = first; i < last; i++) {
				int offset = i - first;

				int top = arr[first][i];

				// left -> top
				arr[first][i] = arr[last - offset][first];

				// bottom -> left
				arr[last - offset][first] = arr[last][last - offset];

				// right -> bottom
				arr[last][last - offset] = arr[i][last];

				// top- > right
				arr[i][last] = top;

			}

		}

		System.out.println("After 90 degreee rotation :: ");
		for (int k = 0; k < n; k++) {
			System.out.println(" | " + arr[k][0] + " " + arr[k][1] + " " + arr[k][2] + " " + arr[k][3] + " | ");
		}
	}

}
