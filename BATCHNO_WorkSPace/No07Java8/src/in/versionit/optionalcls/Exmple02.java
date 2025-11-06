package in.versionit.optionalcls;

import java.util.Optional;

public class Exmple02 {

	Optional<String> getUserNameById(Integer id) {

		String name = null;

		if (id == 101) {
			name = "kiran";
		} else if (id == 102) {
			name = "vijay";
		}

		return Optional.ofNullable(name);

	}

	public static void main(String[] args) {

		Exmple02 e1 = new Exmple02();

		Optional<String> name = e1.getUserNameById(103);

		if (name.isPresent()) {
			String name1 = name.get();
			System.out.println(name1.toUpperCase());
		} else {
			System.out.println("Data not available");
		}

	}

}
