package cg.javaflp.practice;

/** 
 * This class is use to run the pragram
 * as this class has p.s.v. main method
 */
public class MainClass {

	/** Main method, starting point of program
	 */
	public static void main(String[] args) {
		// Instantiating object of non static inner class
		// Outer.Inner inner = new Outer().new Inner();
		
		// Instantiating object of static inner (nested) class
		Outer.Inner inner = new Outer.Inner();
		inner.display();
	}
}
