package no01.in.thiru1.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class No01Set2 {

	public static void main(String[] args) {
		
		
		//HashSet
		//LinkedHashSet
		//Treeset
		
			Set<Integer> s1=new TreeSet<>();
			//1000,2000,3000,7000,9000,10000
			
			s1.add(2000);
			s1.add(3000);
			s1.add(1000);
			s1.add(7000);
			s1.add(9000);
			s1.add(10000);
			s1.add(null);
			
			
			
			
			System.out.println(s1);
		
	}

}
