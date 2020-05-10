package cg.javaflp.practice;

import java.util.Calendar;

public class CalendarPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		// setting date of calendar and printing its date
		cal.set(2009, 1, 13);
		System.out.println(cal);            // print obj ref
		System.out.println(cal.getTime());	// print date
		
		cal.set(Calendar.YEAR, 2012);		// changing its year
		System.out.println(cal.getTime());
		
		// similar for date and month
		cal.set(Calendar.MONTH, 8);
		cal.set(Calendar.DAY_OF_MONTH, 9);
		System.out.println(cal.getTime());
		
		// how to get values
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
		// changing time of the day
		cal.set(Calendar.HOUR_OF_DAY, 16);
		System.out.println(cal.getTime());
	}

}
