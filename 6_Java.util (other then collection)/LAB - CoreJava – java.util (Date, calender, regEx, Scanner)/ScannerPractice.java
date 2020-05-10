package cg.javaflp.practice;
import java.util.Scanner;

public class ScannerPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// receiving user's name
		System.out.println("Please enter your name: ");
		String name = sc.next();
		
		// receiving user's birth place (name of city)
		System.out.println("Please enter your Birth place: ");
		String birthPlace = sc.next();
		
		// receiving user's age
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		
		// Counting characters of birth place (city) name 
		int length = birthPlace.length();
		age = age + length;   // modified the age
		
		// displaying output massage
		System.out.println("Hi, " + name + " your actual age is " 
				                  + age +  "\n" + "MUAHAHAHHAHA");
	}
}
