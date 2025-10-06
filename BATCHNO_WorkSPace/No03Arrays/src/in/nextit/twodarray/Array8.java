package in.nextit.twodarray;

public class Array8 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 5, 6, 0};

		
		System.out.println("Even Number in the array");
		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] % 2 == 0) {
				System.out.print(arr1[i]+" ");
			}

		}
		System.out.println();
		System.out.println("Odd Number in the array");
		
		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] % 2 == 1) {
				System.out.print(arr1[i]+" ");
			}

		}

	}

}
