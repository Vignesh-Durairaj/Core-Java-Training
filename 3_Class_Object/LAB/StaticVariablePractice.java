package cg.javaflp.practice;

public class StaticVariablePractice {
	
	public static void main(String[] args) {
		// craete 2 objects of practice class
		Practice obj1 = new Practice();
		Practice obj2 = new Practice();
		
		// set different value of x (non static variable) for obj1 & obj2  
		obj1.x = 12;
		obj2.x = 14;
		
		// set different value of y (static variable) for obj1 & obj2
		obj1.y = 23;
		obj2.y = 28;
		
		System.out.println("Value of X & Y in obj1 is : " + obj1.x + " and " + obj1.y);
		
		System.out.println("Value of X & Y in obj2 is : " + obj2.x + " and " + obj2.y);
	}
}


class Practice{
	int x;
	static int y;
}