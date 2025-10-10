package in.versionit.string2;

public class Example3 {

	public static void main(String[] args) {

		String name = "hello";
//		   01234
		
		int start=name.length()-1;
		int end=0;

		while(start>=end)
		{
			
			System.out.println(name.charAt(start));
			
			
			start--;
		}



	}

}
