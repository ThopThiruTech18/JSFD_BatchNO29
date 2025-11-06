package no01.in.versionit.fi;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

//		list.forEach(s->System.out.println(s));
//		list.forEach(System.out::println);

	}

}
