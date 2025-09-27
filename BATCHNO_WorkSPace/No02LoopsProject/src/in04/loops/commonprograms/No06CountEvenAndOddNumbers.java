package in04.loops.commonprograms;

public class No06CountEvenAndOddNumbers {

	public static void main(String[] args) {

		int number = 12345;
		int rem;

		int even = 0;
		int odd = 0;

		int temp = number;

		while (number > 0) {
			rem = number % 10;

			if (rem % 2 == 0) {
				even++;
			} else {
				odd++;
			}

			number = number / 10;

		}
		System.out.println(even);
		System.out.println(odd);

	}

}
