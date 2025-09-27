package in01.loops.nestedforloop;

public class Pattern12 {

	public static void main(String[] args) {

		topLeftTriangle();

		topRightTriangle();

	}

	private static void topLeftTriangle() {
		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}
	}

	private static void topRightTriangle() {

		System.out.println("topRightTriangle");
		for (int i = 5; i >= 1; i--) {

			for (int spaces = 1; spaces <= 5 - i; spaces++) {
				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}
	}

}
