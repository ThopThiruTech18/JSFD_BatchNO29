package no01.in.thiru1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class No02ArrayListExample4 {

	public static void main(String[] args) {

		ArrayList<Student> list1 = new ArrayList<Student>();

		list1.add(new Student(101, "kiran"));
		list1.add(new Student(102, "charan"));

		list1.add(new Student(103, "vijay"));
		list1.add(new Student(104, "manoj"));
		
		ListIterator<Student> listIterator = list1.listIterator();
		
		
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
		System.out.println("------------------------------");
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
		
		
		
	}

}
