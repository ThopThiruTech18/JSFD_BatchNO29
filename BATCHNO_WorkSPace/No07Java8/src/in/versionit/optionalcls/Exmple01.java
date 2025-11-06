package in.versionit.optionalcls;

public class Exmple01 {

	String getUserNameById(Integer id) {

		if (id == 101) {
			return "kiran";
		} else if (id == 102) {
			return "vijay";
		}

		return null;

	}

	public static void main(String[] args) {

		Exmple01 e1 = new Exmple01();

		String name = e1.getUserNameById(102);
		;

		if (name != null) {
			System.out.println(name.toUpperCase());
		}

	}

}
