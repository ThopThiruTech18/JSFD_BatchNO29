package no01.in.thiru1.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class MapExample3 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map1=new LinkedHashMap<>();
		map1.put(4, "hello");
		map1.put(1, "abc");
		map1.put(2, "bcd");
		map1.put(5, "hello");
		map1.put(3, "cde");
		map1.put(1, "de");
		map1.put(null, "hi");
		map1.put(null, "hello");
		
	
		
		System.out.println(map1);
		
				
		
	}
	
	

}
