package in.nextit;

import java.util.Arrays;
import java.util.Iterator;

public class Array5 {

	public static void main(String[] args) {

		int[] array1 = new int[] { 12, 4, 7, 8, 9, 1 };
		int temp;

//		Arrays.sort(array1);
//		
//		for (int i = 0; i < array1.length; i++) {
//			System.out.println(array1[i]);
//			
//		}

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array1.length; j++) {

				if (array1[i] < array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}

			}

		}
		
		for (int i = 0; i < array1.length; i++) {
		 System.out.print(array1[i]+" ");
	}
		System.out.println();
		System.out.println("min value");
		System.out.println(array1[1]);
		
		System.out.println("max value");
		System.out.println(array1[array1.length-2]);
		


	}

}
