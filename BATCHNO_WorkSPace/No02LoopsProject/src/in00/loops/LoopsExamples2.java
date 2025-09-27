package in00.loops;

public class LoopsExamples2 {

	public static void main(String[] args) {

		// for loop
//		int start = 1;
//		int end = 100000;
//
//		for (int i = start; i <= end; i++) {
//			System.out.println(i + " : Welcom to hyderabad");
//		}

		// while loop

		int start1 = 1;
		int end1 = 10;

		while (start1 >= end1) {
			System.out.println(start1 + " : Welcom to hyderabad");
			start1++;
		}

		System.out.println("-----------------------");
		// do-while
		int start = 1;
		int end = 10;

		do {
			System.out.println(start + " : Welcom to hyderabad");
			start++;
		} while (start >= end);

	}

}
