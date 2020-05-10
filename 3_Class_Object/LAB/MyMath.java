package cg.javaflp.practice;

/**
 * This class performs various mathematical operations
 * like addition, substract, multiple, divide etc
 */
public class MyMath {

	/**
	 * @param firstNumber
	 * @param secondNumber
	 * @return double (addition of two numbers)
	 */
	public double add(double firstNumber, double secondNumber){
		return firstNumber + secondNumber;
	}
	
	public double substract(double firstNumber, double secondNumber){
		return firstNumber - secondNumber;
	}
	
	public double multiple(double firstNumber, double secondNumber){
		return firstNumber * secondNumber;
	}
	
	public double divide(double firstNumber, double secondNumber){
		return firstNumber / secondNumber;
	}
	
	public double modulus(double firstNumber, double secondNumber){
		return firstNumber % secondNumber;
	}
}
