package in01.loops.nestedforloop;

public class Pattern13 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int spaces = 1; spaces <= 5 - i; spaces++) {

				System.out.print("  ");

			}

			for (int j = 1; j <= 2 * i - 1; j++) {

				System.out.print("* ");

			}

			System.out.println();

		}

		for (int i = 5; i >= 1; i--) {

			for (int spaces = 1; spaces <= 5 - i; spaces++) {

				System.out.print("  ");

			}

			for (int j = 1; j <= 2 * i - 1; j++) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

}
