package in.nextit.twodarray;

public class Array3 {
	public static void main(String[] args) {
		
		//C=A*B  [2X3][3X2]

		int[][] A = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        int[][] B = {
	            {7, 8},
	            {9, 10},
	            {11, 12}
	        };
	        
	       // [1X7+2X9+3x11  1X8+2X10+3X12]
	        //[4X7+5X9

	        int rowsA = A.length;      // 2
	        int colsA = A[0].length;   // 3
	        int colsB = B[0].length;   // 2

	        int[][] C = new int[rowsA][colsB]; // Result matrix

	        // Matrix multiplication logic
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                for (int k = 0; k < colsA; k++) {
	                    C[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }

	        // Print result
	        System.out.println("Result of Matrix Multiplication:");
	        for (int i = 0; i < C.length; i++) {
	            for (int j = 0; j < C[0].length; j++) {
	                System.out.print(C[i][j] + " ");
	            }
	            System.out.println();
	        }

	}

}
