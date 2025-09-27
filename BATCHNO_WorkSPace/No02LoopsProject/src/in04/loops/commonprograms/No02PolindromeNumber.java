package in04.loops.commonprograms;

public class No02PolindromeNumber {

	public static void main(String[] args) {

		int number = 12321;
		int sum = 0, rem;

		int temp = number;

		while (number > 0) {
			rem = number % 10;// 1,2,3

			sum = sum * 10 + rem; // 12321

			number = number / 10; //

		}

		if (sum == temp) {
			System.out.println("Polindrom Number");
		} else {
			System.out.println("Not a polindrome number");
		}

	}

}
