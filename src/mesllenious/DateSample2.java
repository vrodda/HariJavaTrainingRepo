package mesllenious;

import java.util.Date;

public class DateSample2 {

	public static void main(String[] args) {
		
		Date d1 = new Date(2015, 5, 13) ;
		Date d2 = new Date(2015, 4, 30) ;
		
		Date d3 = new Date() ;
		Date d4 = new Date() ;
		
		System.out.println(d2.after(d1));
		
		System.out.println(d2.before(d1));
		
		System.out.println(d2.equals(d1));
		
		System.out.println(d3.equals(d4));
	}
}
