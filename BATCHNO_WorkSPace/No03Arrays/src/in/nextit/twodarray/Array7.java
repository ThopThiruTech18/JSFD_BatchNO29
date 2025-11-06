package in.nextit.twodarray;

public class Array7 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 5, 6 };

		int n = 6;

		int sum2 = 0;

//		for (int i = 1; i <= 6; i++) {
//
//			sum = sum + i;
//
//		}

		int sumOfElements = (n * (n + 1)) / 2;

		for (int i = 0; i < arr1.length; i++) {
			sum2 = sum2 + arr1[i];
		}

		System.out.println(sumOfElements - sum2);

	}

}
