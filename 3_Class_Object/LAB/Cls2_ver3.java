package tdi.javaFLP.languageBasic;

/** This class have a method "display" which displays a message on console
 */
public class Cls2 {
	
	/** Modifying the Default constructor */
	public Cls2() {
		System.out.println("Inside dafault constructor of Cls2");
	}
	
	/**  One more constructor of cls2 */
	public Cls2(String name){
		System.out.println("Hi " + name + " you are Inside parametrized constructor of Cls2");
	}
	
	/** ignore what is public, void here that we will learn 
	 *  when we will see the method signature in details
	 */
	
	public void display(){
		System.out.println("Hi.... You are in display mehtod of cls2");
	}
}
