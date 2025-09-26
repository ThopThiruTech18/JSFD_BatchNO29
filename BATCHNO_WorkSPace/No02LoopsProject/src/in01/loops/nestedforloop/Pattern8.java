package in01.loops.nestedforloop;

public class Pattern8 {

	public static void main(String[] args) {
		System.out.println("started");

		for (char i = 'A'; i <= 'E'; i++) {

			for (int j = 'A'; j <= i; j++) {
				System.out.print(i);
			}

			System.out.println();

		}

	}

}
