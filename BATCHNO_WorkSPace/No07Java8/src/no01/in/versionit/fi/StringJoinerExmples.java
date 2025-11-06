package no01.in.versionit.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExmples {

	public static void main(String[] args) {


		
		
		
//		StringJoiner list=new StringJoiner("_");
		
		StringJoiner list=new StringJoiner(",","{","}");
		list.add("hari");
		list.add("john");
		list.add("chinna");
		list.add("vinay");
		list.add("hari");
		list.add("john");
		list.add("chinna");
		list.add("vinay");
		list.add("hari");
		list.add("john");
		list.add("chinna");
		
		System.out.println(list);
		
		

	}

}
