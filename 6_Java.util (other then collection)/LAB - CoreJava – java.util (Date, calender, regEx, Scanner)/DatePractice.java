package cg.javaflp.practice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {

	/** Main method - starting point of application
	 */
	public static void main(String[] args) {
		// creating date object by its two constructors 
		Date date1 = new Date();
		System.out.println("Date1 : " + date1);

		/*
		Date date2 = new Date(34567892L);
		System.out.println("Date2 : " + date2);

		// use of methods of Date class
		int resultCompare = date2.compareTo(date1);
		System.out.println(resultCompare);
		
		boolean result = date2.after(date1);
		System.out.println(result);
		
		result = date2.before(date1);
		System.out.println(result);
		
		System.out.println(date1.getTime());
		
		date2.setTime(1434568923457L);
		System.out.println(date2);
		*/
		
		/* Formatting of date with the help of simple date format
		 */
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("Date1: " + sdf.format(date1));
		
		/* Parsing of a string into date object
		 */
		String date3Str = "03/28/2006";
		String pattern1 = "MM/dd/yyyy";
		SimpleDateFormat format = new SimpleDateFormat(pattern1);
		
		try {
			Date date3 = format.parse(date3Str);
			System.out.println("Date from string parsing : " + date3);
			// add code below after running the above code
			Date date4 = sdf.parse(date3Str);
			System.out.println("same Date from diff sdf parsing : " + date4);
		} catch (ParseException e) {
			System.out.println("Could not parse, some input data error");
			e.printStackTrace();
		}
	}
}
