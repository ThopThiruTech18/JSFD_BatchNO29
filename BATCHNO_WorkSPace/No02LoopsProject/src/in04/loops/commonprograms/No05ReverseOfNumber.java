package in04.loops.commonprograms;

public class No05ReverseOfNumber {

	public static void main(String[] args) {

		int number = 12345;
		int sum = 0, rem;

		int temp = number;

		while (number > 0) {
			rem = number % 10;

			sum = sum*10 + rem;

			number = number / 10; 

		}
		System.out.println(sum);

		

	}

}
