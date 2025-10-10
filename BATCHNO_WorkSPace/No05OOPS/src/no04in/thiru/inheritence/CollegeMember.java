package no04in.thiru.inheritence;

public class CollegeMember {

	String name;
	int id;

	 public CollegeMember(String name, int id) {
		this.name = name;
		this.id = id;
	}

	protected void printData() {
		System.out.println(name);
		System.out.println(id);
	}

}
