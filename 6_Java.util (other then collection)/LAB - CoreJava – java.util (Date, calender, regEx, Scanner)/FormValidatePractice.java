package cg.javaflp.practice;

import java.util.Scanner;

public class FormValidatePractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		String birthPlace = "";
		int age = 0;
		
		/* We will use do-while loop for all input values as 
		 * User needs to re-enter the value, until enters valid data
		 */
		
		boolean isValidEntry = false;
		
		//receiving user's name and validating it
		do {
			System.out.println("Please enter your name: ");
			name = sc.next();
			isValidEntry = ValidateFormFields.isValidText(name);
		} while (!isValidEntry);
		
		// receiving and validating birth place
		do {
			System.out.println("Please enter your Birth place: ");
			birthPlace = sc.next();
			isValidEntry = ValidateFormFields.isValidText(birthPlace);
		} while (!isValidEntry);
		
		// receiving and validating user's age
		do {
			System.out.println("Please enter your age: ");
			String ageStr = sc.next();
			isValidEntry = ValidateFormFields.isValidNumber(ageStr);
			if (isValidEntry){
				age = Integer.parseInt(ageStr);
			}
		} while (!isValidEntry);
		
		// Counting characters of birth place (city) name 
		int length = birthPlace.length();
		age = age + length;   // modified the age
		
		// displaying output massage
		System.out.println("Hi, " + name + " your actual age is " 
				                  + age +  "\n" + "MUAHAHAHHAHA");
	}

}
