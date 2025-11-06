package in.nextit;

import java.util.Arrays;
import java.util.Iterator;

public class Array7 {

	public static void main(String[] args) {

		  int[] array = {1, 2, 4, 6, 7, 9}; // sequence with missing numbers
	        int n = 9; // the maximum number in the sequence

	        System.out.print("Missing numbers: ");

	        for (int i = 1; i <= n; i++) {
	            boolean found = false;
	            for (int num : array) {
	                if (num == i) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                System.out.print(i + " ");
	            }
	        }

	}

}
