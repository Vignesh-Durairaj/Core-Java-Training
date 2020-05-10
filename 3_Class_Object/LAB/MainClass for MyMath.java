package cg.javaflp.practice;

public class PerformingMathOperation {
	
	public static void main(String[] args) {
		
		MyMath myMath = new MyMath();
		double firstNo = 23.5;
		double secNo = 12;
		
		double result = myMath.add(firstNo, secNo);
		
		System.out.println("Sum of " + firstNo + " and "+ secNo + " : " + result);
	}
}
