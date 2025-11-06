package no01.in.thiru1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class No02ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(10);
		list2.add(200);
		list2.add(300);
		
		list1.retainAll(list2);
		
		System.out.println(list1);
		

		
		
	
		

	}

}
