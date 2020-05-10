package cg.javaflp.practice;

/**
 * This class will have a Inner class
 */
public class Outer {
	
	//Display method of Outer Class
	public void display (){
		System.out.println("inside display method of OUTER class"); 
	}
	
	// Nested class (static inner class)
	static class Inner{
		//Display method of Inner Class
		void display (){
			System.out.println("inside display method of INNER class"); 
		}
	}
	
	// Inner class
	/*class Inner{
		//Display method of Inner Class
		void display (){
			System.out.println("inside display method of INNER class"); 
		}
	}*/
}

