package no02in.thiru.constructor;

public class Employee {
	
	//instance fields
	String name;
	int age;
	double salary;
	
	public Employee() {
		System.out.println("O-Param Constructor");
	}
	Employee(String l_name,int l_age,double l_salary)
	{
    	name=l_name;
    	age=l_age;
    	salary=l_salary;
	}
	
	
//    void takeInputs(String l_name,int l_age,double l_salary)
//    {
//    	name=l_name;
//    	age=l_age;
//    	salary=l_salary;
//    }
    void printData()
    {
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(salary);
    }
    

}
