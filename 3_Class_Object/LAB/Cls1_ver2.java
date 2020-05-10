package tdi.javaFLP.languageBasic;

/** This is main class
 * Here we create object of cls2
 * and will call its methods
 */
public class Cls1 {

	/** Main method - stating point of program
	 * @param args 
	 */
	public static void main(String[] args) {

		// instantiating object of Cls2
		Cls2 cls2Obj = new Cls2();
		
		// instantiating object of Cls2 using other constructor
		Cls2 cls2Obj2 = new Cls2("MyName");
		
		// calling display method of Cls2
		cls2Obj.display();
	}
}
