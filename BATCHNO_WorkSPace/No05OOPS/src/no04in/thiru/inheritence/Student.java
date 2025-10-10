package no04in.thiru.inheritence;

 class Student extends CollegeMember {

	int marks;

	public Student(int marks, String name, int id) {

		super(name, id);
		this.marks = marks;

	}

	public void printData() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
	}

}
