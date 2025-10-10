package no05in.thiru.accessmodifiers1.other;

import no05in.thiru.accessmodifiers1.Employee;

public class OtherClass  extends Employee{
	
	 public static void main(String[] args) {
		 OtherClass obj=new OtherClass();
	        // System.out.println(obj.privateMsg);   // ❌ Not accessible
	        // System.out.println(obj.defaultMsg);   // ❌ Not accessible (different package)
	        System.out.println(obj.protectedMsg); // ❌ Not accessible directly
	        System.out.println(obj.publicMsg);       // ✅ Accessible

	        // ✅ Accessible through inheritance (subclass)
	        OtherClass child = new OtherClass();
	    }

}
