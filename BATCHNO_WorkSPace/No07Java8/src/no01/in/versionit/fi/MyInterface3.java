package no01.in.versionit.fi;

import java.util.function.Predicate;

public interface MyInterface3 {

	public static void main(String[] args) {

		String[] names = { "Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };

		Predicate<String> p1 = p -> p.charAt(0) == 'A';
		
//		"Anushka".charAt(0)=='A';

		for (String name : names) {

			if (p1.test(name)) {
				System.out.println(name);
			}

		}

	}

}
