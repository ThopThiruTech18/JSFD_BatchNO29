package in.versionit;

public class AddMatrix {
	
	public static void main(String[] args) {
		 int[][] A = {{1,2,3},{4,5,6}};
	        int[][] B = {{7,8},{9,10},{11,12}};

	        // Result rows = A rows, cols = B cols
	        int[][] result = new int[2][2];

	        // Multiply: result[i][j] = sum of A[i][k] * B[k][j]
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < B[0].length; j++) {
	                for (int k = 0; k < B.length; k++) {
	                    result[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }

	        // Print result
	        for (int[] row : result) {
	            for (int val : row) System.out.print(val + " ");
	            System.out.println();
	        }
	}

}
