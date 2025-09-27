package in01.loops.nestedforloop;

public class Pattern11 {

	public static void main(String[] args) {
		bottomLeftTriangle();

		bottomRightTraingle();

	}

	
	private static void bottomLeftTriangle() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i);

			}

			System.out.println();

		}
	}
	private static void bottomRightTraingle() {

		for (int i = 1; i <= 5; i++) {

			for (int spaces = 1; spaces <= 5 - i; spaces++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print(i);

			}

			System.out.println();

		}

	}

	

}
