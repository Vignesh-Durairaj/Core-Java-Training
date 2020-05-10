package cg.javaflp.practice;

import java.text.DateFormatSymbols;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * This class is use to tell a users age, on which day user were born 
 * and this year his/her birthday will be on which day
 */
public class DayPredictor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Receiving user input for user's data of birth
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter your age in dd/MM/yyyy format :");

		String birthdateStr = sc.next();
		String[] strArr = birthdateStr.split("/");

		int year = Integer.parseInt(strArr[2]);
		int month = Integer.parseInt(strArr[1]);
		int dayOfMonth = Integer.parseInt(strArr[0]);

		// Creating calendar (date) object with the help of user data
		GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);

		// Finding out day of user's birth date
		String[] weekdays = new DateFormatSymbols().getWeekdays();
		String birthDay = weekdays[cal.get(GregorianCalendar.DAY_OF_WEEK)];

		// Finding age of user as of today
		GregorianCalendar today = new GregorianCalendar();
		int age = today.get(GregorianCalendar.YEAR)
				- cal.get(GregorianCalendar.YEAR);

		// Finding out day of user's birth date in current year
		cal.set(GregorianCalendar.YEAR, 2012);
		String thisYearDay = weekdays[cal.get(GregorianCalendar.DAY_OF_WEEK)];

		System.out.println("You were born on " + birthDay);
		System.out.println("Today, you are " + age + " years old");
		System.out.println("This year, your birthday will be on " 
							+ thisYearDay);
	}

}
