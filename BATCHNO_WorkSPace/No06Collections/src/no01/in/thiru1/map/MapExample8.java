package no01.in.thiru1.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample8 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map1=new TreeMap<>();
		map1.put(4, "hello");
		map1.put(1, "abc");
		map1.put(2, "bcd");
		map1.put(5, "hello");
		map1.put(3, "cde");
		map1.put(1, "de");
		
	
		System.out.println("keyes..................");
		Set<Integer> keySet = map1.keySet();
		
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
		
		System.out.println("values..................");
		
		Collection<String> values = map1.values();
		
		for (String string : values) {
			
			System.out.println(string);
			
		}
		
		
		
				
		
	}
	
	

}
