package no04in.thiru.inheritence.super1;

public class Employee extends CollegeMember {

	int salary;

	public Employee(int salary, String name, int id) {
		
		super(name, id);
		this.salary = salary;
		

	}
	
	 public void printData()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}

}
