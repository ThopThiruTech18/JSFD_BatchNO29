package in.nextit.twodarray;

import java.util.Arrays;

public class Array9 {
	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 0, 2, 12,0, 1, 0, 2, 12 }; // 1,2,12,0,0

		int index = 0;

		for (int num : arr1) {

			if (num != 0) {
				arr1[index++] = num;
			}

		}
		
		while(index <arr1.length)
		{
			arr1[index++] = 0;
		}
		

     for (int num : arr1) {
    	 
    	 System.out.print(num+", ");
		
	}

	}

}
