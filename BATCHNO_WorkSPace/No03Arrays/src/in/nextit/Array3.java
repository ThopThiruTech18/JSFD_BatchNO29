package in.nextit;

public class Array3 {

	public static void main(String[] args) {

		int[] array1 = new int[] { 2, 4, 7, 8, 9 };
        int sum=0;

		for (int i : array1) {

			sum+=i;  //sum=sum+i

		}
		System.out.println("Sum of the array is : "+sum);
		System.out.println("Average of the array is : "+sum/array1.length);

	}

}
