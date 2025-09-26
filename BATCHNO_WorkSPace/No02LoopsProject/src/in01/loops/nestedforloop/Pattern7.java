package in01.loops.nestedforloop;

public class Pattern7 {

	public static void main(String[] args) {
		System.out.println("started");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println();

		}

	}

}
