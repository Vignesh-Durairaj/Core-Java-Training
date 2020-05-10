package cg.javaflp.practice;

public class StaticMethodPractice {

	public static void main(String[] args) {
		// instantiate objects of practice class
		Practice2 obj1 = new Practice2();
		
		//calling non-static method of Practice class
		obj1.display();
		
		//calling static method of Practice class, using object
		obj1.displayStatic();
		
		//calling non-static method of Practice class, without object
		Practice2.displayStatic();
		
	}
}


class Practice2{
	
	static void displayStatic(){
		System.out.println("Inside a static mathod of practice class");
	}
	
	void display(){
		System.out.println("Inside a non - static mathod of practice class");
	}
}
