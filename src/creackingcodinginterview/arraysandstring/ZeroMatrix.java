package creackingcodinginterview.arraysandstring;

public class ZeroMatrix {

	/**
	 *  Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0. 
	 * @param args
	 */
	
	/**
	 * We can reduce the space to 0(1) by using the first row as a replacement for
	 * the row array and the first column as a replacement for the column array.
	 * This works as follows:
	 *  1. Check if the first row and first column have any
	 * zeros, and set variables rowHasZero and columnHasZero. (We'll nullify the
	 * first row and first column later, if necessary.) 
	 * 
	 * 2. Iterate through the rest
	 * of the matrix, setting matrix[ i] [ 0) and matrix [ 0) [ j] to zero whenever
	 * there's a zero in matrix[i] [j ]. 
	 * 
	 * 3. Iterate through rest of matrix,
	 * nullifying row i if there's a zero in matrix [ i] [ 0]. 
	 *
	 * 4. Iterate through
	 * rest of matrix, nullifying column j if there's a zero in matrix [ 0] [ j].
	 * 
	 * 5.Nullify the first row and first column, if necessary (based on values from
	 * Step 1 ).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arrb = { { 1, 2, 3 ,4}, {  5, 0,7,8 }, { 9,10,11,12 },  { 13,14,0,16 } };
		
		for (int k = 0; k < arrb.length; k++) {
			System.out.println(" | "+arrb[k][0] + " " + arrb[k][1] + " " + arrb[k][2] +" "+   arrb[k][3]+" | ");
		}
		
		boolean firstRowHasZero = false;
		boolean firstColumnHasZero = false;
		
		
		
		for (int k = 0; k < arrb[0].length; k++) {
			if(arrb[0][k] == 0) {
				firstRowHasZero = true;
				break;
			}
		}
		
		for (int k = 0; k < arrb.length; k++) {
			if(arrb[k][0] == 0) {
				firstColumnHasZero = true;
				break;
			}
		}
		
		for(int i=1; i<arrb[0].length; i++ ) {
			for(int j=1; j<arrb.length; j++) {
				if(arrb[i][j] ==0) {
					arrb[i][0] = 0;
					arrb[0][j] = 0;
				}
			}
		}
		
		
		// check for rows
		for (int i = 1; i < arrb.length; i++) {
			if (arrb[i][0] == 0) {
				nullifyRow(arrb, i);
			}
		}

		// check for column
		for (int i = 1; i < arrb[0].length; i++) {
			if (arrb[0][i] == 0) {
				nullifycolumn(arrb, i);
			}
		}
		
		// nullify first row
		if(firstRowHasZero) {
			nullifyRow(arrb, 0);
		}
		
		// nullify first column
		if(firstColumnHasZero) {
			nullifycolumn(arrb,0);
		}
		
		
		System.out.println("Final result");
		
		for (int k = 0; k < arrb.length; k++) {
			System.out.println(" | "+arrb[k][0] + " " + arrb[k][1] + " " + arrb[k][2] +" "+   arrb[k][3]+" | ");
		}

	}
	
	private static void nullifyRow(int[][] arr, int row) {

		for (int k = 0; k < arr[0].length; k++) {
			arr[row][k] = 0;
		}
	}

	private static void nullifycolumn(int[][] arr, int column) {

		for (int k = 0; k < arr.length; k++) {
			arr[k][column] = 0;
		}
	}

}
