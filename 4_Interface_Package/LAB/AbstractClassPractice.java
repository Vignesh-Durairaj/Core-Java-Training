package cg.javaflp.practice;

public class AbstractClassPractice {

	public static void main(String[] args) {
		// trying to create object of an abstract class
		// ForAbstractPractice practice = new ForAbstractPractice();
	}
}

/**
 * Writting and abstract method; without using abstract modifier
 */
abstract class ForAbstractPractice{
	
	public void nonAbstractDisplay(){
		System.out.println("non abstract method of an abstract class");
	}
	
	// public void abstractDisplay();   // COMPILATION ERROR
}