package no01.in.versionit.fi;

import java.util.function.Predicate;

public interface MyInterface2 {

	public static void main(String[] args) {
		
		Predicate<Integer> p1=p-> p >10;
		
		System.out.println(p1.test(10));

	}

}
