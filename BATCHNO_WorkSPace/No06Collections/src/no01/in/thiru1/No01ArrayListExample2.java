package no01.in.thiru1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class No01ArrayListExample2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		
		

		// 01) for loop
		// 02) for-each loop
		// 03) Iterator
		// 04) ListIterator
		// 05) Lambda empressions
		// 06) Method reference
		// 07) Enumeration(It will iterate the legacy objects data]]

//		// 01) for loop
//		System.out.println("01) for loop");
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}
//		// 02) for-each loop
//		System.out.println("for-each loop");
//
//		for (Object object : al) {
//
//			System.out.println(object);
//
//		}
//
//		// 05) Lambda empressions
//		System.out.println("05) Lambda empressions");
//		al.forEach(a -> System.out.println(a));
//
//		// 06) Method reference
//		System.out.println(" 06) Method reference");
//		al.forEach(System.out::println);
//
//		// 03) Iterator
//
//		System.out.println("// 03) Iterator");
//		Iterator iterator = al.iterator();
//
//		while (iterator.hasNext()) {
//			Object next = iterator.next();
//			System.out.println(next);
//		}
//
		// 04) ListIterator
		System.out.println("04) ListIterator:: hasNext");
		ListIterator listIterator = al.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		
		System.out.println("04) ListIterator:: hasPrevious");

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

		// 07) Enumeration(It will iterate the legacy objects data]]

	}

}
