package no06.in.versionit.splitorator;

import java.util.Arrays;
import java.util.List;

public class SplitoratorExample {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(10, 20, 30, 50);

//		method1(asList);
		
		
		
		asList.spliterator().forEachRemaining(System.out::println);

	}

	private static void method1(List<Integer> list) {

//		for (Integer integer : asList) {
//			System.out.println(integer);
//			
//		}

		list.stream().spliterator().forEachRemaining(s -> System.out.println(s));
	}

}
