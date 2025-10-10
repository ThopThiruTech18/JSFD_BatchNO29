package no03in.thiru.thiskeyword1;

public class Employee {
	
	//instance fields
	String name;
	int age;
	double salary;
	
	public Employee() {
//		this("kiran",11,50000.0);
		
		System.out.println("O-Param Constructor");
	}
	Employee(String name,int age,double salary)
	{
//		this();
    	this.name=name;
    	this.age=age;
    	this.salary=salary;
    	
    	this.printData();
    	
	}
	
	
    void printData()
    {
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(salary);
    }
    

}
