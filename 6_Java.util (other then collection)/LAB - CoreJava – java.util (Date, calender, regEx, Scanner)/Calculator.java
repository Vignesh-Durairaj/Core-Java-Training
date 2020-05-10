package cg.javaflp.practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Select your mathematical operation: enter "
				+ " \n 1 to Add, \n 2 to Substract \n "
				+ "3 to Multuply, 4 to Divide");
		int userChoice = sc.nextInt();

		System.out.println("Provide two numbers; " +
				"press enter/space key after each nos");
		double firstNumber = sc.nextDouble();
		double secondNumber = sc.nextDouble();

		MyMath myMath = new MyMath();
		double result = 0.0;

		switch (userChoice) {
		case 1:
			System.out.println("Addition of " + firstNumber + " and "
					+ secondNumber + " :");
			result = myMath.add(firstNumber, secondNumber);
			System.out.print(result);
			break;
		case 2:
			System.out.println("Substraction of " + firstNumber + " and "
					+ secondNumber + " :");
			result = myMath.substract(firstNumber, secondNumber);
			System.out.print(result);
			break;
		case 3:
			System.out.println("Multiple of " + firstNumber + " and "
					+ secondNumber + " :");
			result = myMath.multiple(firstNumber, secondNumber);
			System.out.print(result);
			break;
		case 4:
			System.out.println("Division of " + firstNumber + " and "
					+ secondNumber + " :");
			result = myMath.divide(firstNumber, secondNumber);
			System.out.print(result);
			break;
		default:
			System.out.println("Invalid operation choice.");
			break;
		}
	}
}
