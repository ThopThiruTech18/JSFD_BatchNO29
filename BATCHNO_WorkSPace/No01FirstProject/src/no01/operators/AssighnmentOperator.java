package no01.operators;

public class AssighnmentOperator {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;
		int c = 4;
		int d = 5;
		int e = 6;
		System.out.println(a += 10);// a=a+10
		System.out.println(b -= 10);// a=b-10
		System.out.println(c *= 10);// a=c*10
		System.out.println(d /= 10);// a=d/10
		System.out.println(e %= 10);// a=a%10
		
		
		int num=-1;
		
		String result=(num>0)?"Positive Number":"Negative Number";
		System.out.println(result);

	}

}
