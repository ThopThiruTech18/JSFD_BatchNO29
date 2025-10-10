package no04in.thiru.inheritence;

public class College {
	
	public static void main(String[] args) {
		
		Student std1=new Student(65, "Hari", 101);
		
		std1.printData();
		System.out.println("--------------------------");
		Employee emp1=new Employee(5000, "king", 1111);
		emp1.printData();
		
	}

}
