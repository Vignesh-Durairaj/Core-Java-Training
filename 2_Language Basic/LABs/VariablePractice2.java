package tdi.javaFLP.languageBasic;

/**
 * This class is use to various type of practice on 
 * variables (Local, global) and constants; and on data types 
 */
public class VariablePractice2 {
	
	/**
	 *  please ignore static word here;
	 *  We will learn about static in next chapter 
	 *  For now just ignore it and use it for this example
	 */
	
	/* define few global variable and initialize them
	 * also define some constants
	 * (here for example I have defined an int type 
	 * variable and constants)
	 */
	static int x = 12;
	
	static final int y = 10;
	
	
	public static void main(String[] args) {

		// printing the value x 
		System.out.println("value of int x before modifying: " + x);
		
		// modifying its value
		x = 14;
		
		// printing it to check, if global variable can be modified locally
		System.out.println("value of int x after modifying: " + x);
		
		// try to modify constant, complier will not alloow
		// u = 16;   
	}
}
