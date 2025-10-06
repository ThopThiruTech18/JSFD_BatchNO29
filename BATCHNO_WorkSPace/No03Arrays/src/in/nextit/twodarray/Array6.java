package in.nextit.twodarray;

public class Array6 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		int[] arr3 = new int[arr1.length + arr2.length];

		int k = 0;

		for (int num : arr1) {

			arr3[k++] = num;
		}

		for (int num : arr2) {

			arr3[k++] = num;
		}

	}

}
