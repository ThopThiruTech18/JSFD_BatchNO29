package no01.in.versionit.fi;

import java.util.function.Supplier;

public class MyInterface5 {
	
	
	public static void main(String[] args) {
		
		
		//123456
		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 1; i <= 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};

		System.out.println(s.get());
		
		
	}

	

}
