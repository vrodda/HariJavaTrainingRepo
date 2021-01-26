package mesllenious;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		
		String s1 = "2 Jan, 2010 5:30:55 pm";
		
		SimpleDateFormat  format = new SimpleDateFormat("d MMM, yyyy hh:mm:ss a");
		
		Date date = format.parse(s1);
		
		System.out.println(date);
	}
}
