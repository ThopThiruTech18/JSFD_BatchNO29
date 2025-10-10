package no03in.thiru.thiskeyword;

public class Employee {
	
	//instance fields
	String name;
	int age;
	double salary;
	
	public Employee() {
		System.out.println("O-Param Constructor");
	}
	Employee(String name,int age,double salary)
	{
    	name=name;
    	age=age;
    	salary=salary;
	}
	
	
    void printData()
    {
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(salary);
    }
    

}
