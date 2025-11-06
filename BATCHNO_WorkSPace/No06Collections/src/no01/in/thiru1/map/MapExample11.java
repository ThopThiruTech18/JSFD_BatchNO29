package no01.in.thiru1.map;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample11 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map1=new TreeMap<>();
		map1.put(4, "hello");
		map1.put(1, "abc");
		map1.put(2, "bcd");
		map1.put(5, "hello");
		map1.put(3, "cde");
		map1.put(1, "de");
		
	
		System.out.println(map1);
		map1.clear();
		System.out.println(map1.isEmpty());
		
		
		
				
		
	}
	
	

}
