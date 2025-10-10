package in.versionit.string2;

public class Example5 {

	public static void main(String[] args) {

		String name = "mADam";  //smadam
		
		String sum="";
		
		for (int i = name.length() - 1; i >= 0; i--) {

			sum=sum+name.charAt(i);
//			sum+=name.charAt(i);

		}
		
		
		if(name.equals(sum))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}

	}

}
