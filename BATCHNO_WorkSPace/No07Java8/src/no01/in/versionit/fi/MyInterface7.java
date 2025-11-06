package no01.in.versionit.fi;

import java.util.function.Function;

public class MyInterface7 {

	public static void main(String[] args) {

		Integer m1 = m1();
		System.out.println(m1);
	}

	private static Integer m1() {
		Function<String, Integer> fun = f -> f.length();

		return fun.apply("Hari");
	}

}
