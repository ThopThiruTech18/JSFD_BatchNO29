package in.nextit.twodarray;

public class Array1 {
	public static void main(String[] args) {

//		int a=10;
//		int b=20;
//		int sum=a+b;

		int[][] array1 = { { 1, 2 }, 
						   { 3, 4 } };
		int[][] array2 = { { 1, 2 },
							{ 3, 4 } };

		int[][] sum = new int[2][2];

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array2.length; j++) {

				sum[i][j] = array1[i][j] - array2[i][j];

			}

		}

		for (int i = 0; i < sum.length; i++) {

			for (int j = 0; j < sum.length; j++) {

				System.out.print(sum[i][j]+" ");

			}
			System.out.println();

		}

	}

}
