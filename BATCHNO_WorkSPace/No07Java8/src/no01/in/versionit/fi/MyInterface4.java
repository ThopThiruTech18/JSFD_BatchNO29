package no01.in.versionit.fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyInterface4 {
	
	
	public static void main(String[] args) {
		
		Person p1=new Person("hari", 25);
		Person p2=new Person("kiran", 19);
		Person p3=new Person("chakra", 16);
		Person p4=new Person("bunny", 15);
		Person p5=new Person("sunny", 10);
		
		List<Person> listOfPerson = Arrays.asList(p1,p2,p3,p4,p5);
		
		Predicate<Person> a=p->p.age>=18;
		
		for (Person person : listOfPerson) {
			
			if(a.test(person))
			{
				System.out.println(person.age+" : "+person.name);
			}
			
		}
		
		
	}

	

}
