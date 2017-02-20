package core.java.basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTimeExample {

	public static void main(String[] args) {
		Date date= new Date();
		System.out.println(date);
		
		//Simple Date formating
		String format="YYYY/MM/DD :: HH:mm:ss";
		SimpleDateFormat sdf= new SimpleDateFormat(format);
		System.out.println("After Date Format::"+sdf.format(date));
		
		GregorianCalendar  gc= new GregorianCalendar();
		
		//check the year is leap year or not
		System.out.println("Is it a leap year::"+gc.isLeapYear(gc.get(Calendar.YEAR)));
		/*
		 * add 5 days from current day
		 */
		gc.add(Calendar.DATE, 5);
		System.out.println("After adding Days::"+gc.getTime());
		
		
		
	}

}
