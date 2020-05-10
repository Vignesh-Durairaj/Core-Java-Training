package cg.javaflp.practice;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class GregorianCalendarPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.getTime());
		
		/*
		GregorianCalendar cal2 = new GregorianCalendar(TimeZone.getTimeZone("America/Chicago"), Locale.US);
		System.out.println(cal2.getTime());
		
		GregorianCalendar calUK = new GregorianCalendar(Locale.UK);
		System.out.println(calUK.getTime());
		 */
		
		cal.set(GregorianCalendar.DAY_OF_YEAR, 246);
		System.out.println(cal.getTime());
		
		cal.set(GregorianCalendar.DAY_OF_WEEK, GregorianCalendar.TUESDAY);
		System.out.println(cal.getTime());
		
		// use of roll to change current date
		cal.roll(Calendar.MONTH, false);
		System.out.println(cal.getTime());
		
		cal.roll(Calendar.MONTH, -4);
		System.out.println(cal.getTime());
		
		// comparing two calendar objects
		GregorianCalendar today = new GregorianCalendar();
		System.out.println(today.after(cal));
		System.out.println(today.before(cal));
		System.out.println(today.compareTo(cal));
	}

}
