package in.versionit.base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64EncodeDecode {
	
	public static void main(String[] args) {
		
		
		String pazzword="Thirumala@123";
		
		Encoder encoder = Base64.getEncoder();
		
		byte[] encode = encoder.encode(pazzword.getBytes());
		
		String str=new String(encode);
		
		System.out.println(str);
		
		
		Decoder decoder = Base64.getDecoder();
		
		byte[] decode = decoder.decode(encode);
		
		String str1=new String(decode);
		System.out.println(str1);
		
		
		
		
	}

}
