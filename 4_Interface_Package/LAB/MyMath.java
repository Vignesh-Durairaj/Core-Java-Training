package cg.javaflp.practice;

/**
 * This class implemetns IMath Interface 
 * to performs various mathematical operations
 * like addition, substract, multiple, divide etc
 * 
 * This class will provide body to all methods of IMath
 * Now the class is overloaded methods 
 * as per different numbers of arguments
 */
public class MyMath implements IMath, ISplMath{

	/**
	 * @param firstNumber
	 * @param secondNumber
	 * @return double (addition of two numbers)
	 */
	public double add(double firstNumber, double secondNumber){
		return firstNumber + secondNumber;
	}
	
	/**
	 * Overloaded add method
	 * @param firstNumber
	 * @param secondNumber
	 * @param thirdNumber
	 * @return double - sum of three numbers
	 */
	public double add(double firstNumber, double secondNumber, double thirdNumber){
		return firstNumber + secondNumber + thirdNumber;
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

	@Override
	public double sqrt(double number) {
		// TODO Auto-generated method stub
		return 0;
	}

}
