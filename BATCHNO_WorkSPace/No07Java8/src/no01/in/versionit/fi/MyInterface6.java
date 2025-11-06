package no01.in.versionit.fi;

import java.util.function.Consumer;

public class MyInterface6 {

	public static void main(String[] args) {

		Consumer<String> cons = (name) -> System.out.println("The name of the person is : " + name);
		
		cons.accept("Kiran");
		cons.accept("charan");
		cons.accept("vinay");
		cons.accept("teja");

	}

}
