package cg.javaflp.practice;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		MyMath myMath = new MyMath();
		
		int x = 10;
		int y = 0;
		int z = 0;
		try {
			z = myMath.divide(x, y);
		} catch (Exception e) {
			System.out.println("exception occured");
		} finally {
			System.out.println("inside finally");
		}
		System.out.println(z);
		
		
	}
}
