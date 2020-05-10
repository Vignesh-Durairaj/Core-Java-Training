package tdi.javaFLP.languageBasic;

/**
 * @author vivsinha
 * This class is use to various type of practice on 
 * variables (Local, global) and constants; and on data types 
 */
public class VariablePractice1 {
	
	/**
	 *  please ignore static word here;
	 *  We will learn about static in next chapter 
	 *  For now just ignore it and use it for this example
	 */
	
	/* define few global variable and not initializing it
	 * of different data type (int, float, char, boolean, etc.)
	 * 
	 * try to use any reserved keyword as identifier (name of variable) 
	 * and you will see, that compiler will not allow to do so
	 */
	static int x;
	static boolean bool;
	static char c;
	static short s;
	static byte b;
	static double d;
	static float f;
	
	
	
	public static void main(String[] args) {
		
		/* print the default value 
		 * i.e. value of uninitialized variable
		 */
		System.out.println("default value of int: " + x);
		System.out.println("default value of boolean: " + bool);
		System.out.println("default value of char: " + c);
		System.out.println("default value of short: " + s);
		System.out.println("default value of byte: " + b);
		System.out.println("default value of double: " + d);
		System.out.println("default value of boolean: " + f);
	}
}
