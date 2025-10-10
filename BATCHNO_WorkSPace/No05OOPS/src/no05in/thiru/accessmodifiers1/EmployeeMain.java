package no05in.thiru.accessmodifiers1;

public class EmployeeMain {
	
	 public static void main(String[] args) {
	        Employee obj = new Employee();
//	        System.out.println(obj.privateMsg);  // ❌ Not accessible
	        System.out.println(obj.defaultMsg);     // ✅ Accessible (same package)
	        System.out.println(obj.protectedMsg);   // ✅ Accessible (same package)
	        System.out.println(obj.publicMsg);      // ✅ Accessible
	    }

}
