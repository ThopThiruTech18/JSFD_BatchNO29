package in.versionit.string2;

public class Example4 {

	public static void main(String[] args) {

		String name = "hello";
//					   01234
		
		
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

		for (int i = name.length() - 1; i >= 0; i--) {

			System.out.print(name.charAt(i));

		}
		
//		StringBuffer sbr=new StringBuffer(name);
//		String string = sbr.reverse().toString();
//		System.out.println(string);
		
//		System.out.println(new StringBuffer(name).reverse());
//		System.out.println(new StringBuilder(name).reverse());
		
		

	}

}
