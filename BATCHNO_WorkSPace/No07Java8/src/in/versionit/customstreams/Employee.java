package in.versionit.customstreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// setters & getters :: alt + shift +s,r
	// constructors :: alt +shift + so
	// toString : alt+shift + 2s

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
		
//		8️⃣ Get the details of youngest male employee in the Development department.
        
		Employee employee111 = employeeList.stream()
				.filter(s -> s.getGender().equals("Male") && s.getDepartment().equals("Development"))
				.collect(Collectors.minBy(Comparator.comparing(Employee::getAge))).get();
		System.out.println(employee111);
		
		
		
		

//		1️⃣ How many male and female employees are there in the organization?

		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(collect);

//				2️⃣ Print the name of all departments in the organization.

		employeeList.stream().map(s -> s.getDepartment()).distinct().collect(Collectors.toList())
				.forEach(s -> System.out.println(s));
//				3️⃣ What is the average age of male and female employees?

		Map<String, Double> collect2 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(collect2);
//				4️⃣ Get the details of highest paid employee in the organization.

		Optional<Employee> collect3 = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		if (collect3.isPresent()) {
			Employee employee = collect3.get();
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			System.out.println(employee.getYearOfJoining());
			System.out.println(employee.getGender());
		}

		System.out.println("-----------------");
		// 4a️⃣ Get the details of lowest paid employee in the organization.

		Optional<Employee> collect4 = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		if (collect4.isPresent()) {
			Employee employee = collect4.get();
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			System.out.println(employee.getYearOfJoining());
			System.out.println(employee.getGender());
		}
//				5️⃣ Get the names of all employees who have joined after 2015.

		List<String> collect5 = employeeList.stream().filter(f -> f.getYearOfJoining() > 2015).map(s -> s.getName())
				.collect(Collectors.toList());
		System.out.println(collect5);

//				6️⃣ Count the number of employees in each department.
		Map<String, Long> collect11 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println(collect11);
//				7️⃣ What is the average salary of each department?

		Map<String, Double> collect6 = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect6);
//			
//				9️⃣ Who has the most working experience in the organization?   //2020-->2021-> 2023-->2026

		Employee employee2 = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))).get();
		System.out.println(employee2.getId());
		System.out.println(employee2.getName());
		System.out.println(employee2.getYearOfJoining());

//		9️⃣ Who has the most working experience in the organization?   //2020-->2021-> 2023-->2026
		Employee employee3 = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getYearOfJoining))).get();
		System.out.println(employee2.getId());
		System.out.println(employee2.getName());
		System.out.println(employee2.getYearOfJoining());

//				🔟 How many male and female employees are there in the Sales team?
		Map<String, Long> collect7 = employeeList.stream().filter(s -> s.getDepartment().equals("Sales"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(collect7);

		// 11️⃣ What is the average salary of male and female employees?
//				12️⃣ List down the names of all employees in each department.
		
		List<String> collect8 = employeeList.stream().map(emp->emp.getName()).collect(Collectors.toList());
		System.out.println(collect8);
		
//				13️⃣ What is the average salary and total salary of the whole organization?
		Double collect9 = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		double sum = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
		System.out.println(collect9);
		System.out.println(sum);
//				15️⃣ Who is the oldest employee in the organization?

	}

}
