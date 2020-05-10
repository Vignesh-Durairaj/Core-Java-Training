package tdi.javaFLP.languageBasic;

/**
 * This class is use to practice various operation
 * like arithmetic, shift, unary, etc. in Java
 */
public class OperatorPractice {

	/** Main Method (starting point of program)
	 * @param args
	 */
	public static void main(String[] args) {
		
		// PART - A
		// Define a int variable x with initial value 10
		int x = 10;
		
		// practice unary operations x++ and ++x
		System.out.println("x++ unary opr : " + (x++));
		System.out.println("current value of x :" + x);
		System.out.println("++x unary opr : " + (++x));
		
		/** Learning - x++ first uses value of x, then increment it
		 *  ++x first increment it then uses x
		 */
		
		// PART - B  // write an arithmetic expression and check result
		double result1 = 10 + 8 - 6 * 5 % 4 / 3;
		System.out.println("resulr of 10 + 8 - 6 * 5 % 4 / 3 :"  + result1);

		// PART - C  
		// use some parenthesis on the arithmetic expression and check result
		double result2 = 10 + (8 - 6) * 5 % 4 / 3;
		System.out.println("resulr of 10 + (8 - 6) * 5 % 4 / 3 :"  + result2);
		
		/** Learning - precedence of operators
		 */
		
		// PART - D // define another numeric variable and practice some shift operation
		int y = 15;
		y = y>>2;
		System.out.println("value of y (15) after y>>2 : " + y);
		
		// PART - E, F, G.....     // Do some more similar practice
	}

}
