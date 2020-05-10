package cg.javaflp.practice;

/**
 * This class is to check assertion functionality
 * Run this as java application (u will find assert not working)
 * then run as configure and set VM argument -ea
 */
public class AssertionsPractice {

	public static void main(String[] args) {
		
		int x = 10;
		int y = -5;
		int z = new MyMath().divide(x, y);
		assert z > 0 : "one of the number is negative";
		System.out.println(z);
	}

}
