package in.versionit.dataandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example01 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat frmt1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat frmt2 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat frmt3 = new SimpleDateFormat("MM-dd-yyyy");

		String newFormat = frmt3.format(date);
		System.out.println(newFormat);

	}

}
