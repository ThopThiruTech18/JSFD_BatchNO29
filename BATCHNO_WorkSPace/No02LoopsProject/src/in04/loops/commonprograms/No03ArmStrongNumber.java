package in04.loops.commonprograms;

public class No03ArmStrongNumber {

	public static void main(String[] args) {

		int number = 370;
		int sum = 0, rem;

		int temp = number;

		while (number > 0) {
			rem = number % 10;

			sum = sum + rem*rem*rem; 

			number = number / 10; 

		}

		if (sum == temp) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a polindrome number");
		}

	}

}
