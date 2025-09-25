package no01.operators;

public class LogicalOperators {

	public static void main(String[] args) {

		System.out.println(true && true && true && true); // true
		System.out.println(true && true && true && false); // false
		System.out.println(true || false || false || false); // true
		System.out.println(false || false || false || false); // false
		System.out.println(!true);// false
		System.out.println(!false);// true

	}

}
