package no04in.thiru.inheritence.super1;

 class Student extends CollegeMember {

	int marks;

	public Student(int marks, String name, int id) {

		super();
		this.marks = marks;

	}

	public void printData() {
	 super.printData();
		System.out.println(marks);
	}

}
