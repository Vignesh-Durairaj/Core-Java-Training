package tdi.javaFLP.languageBasic;

/**
 * This class is use to practice FOR loop
 */
public class LoopPractice2 {
	
	/** Main Method (starting point)
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 3;
		System.out.println("Table of : " + x);
		
		for(int i = 1; i < 11; i++){
			if (i % 3 != 0)
				System.out.println(x + " * " + i + " : " + x * i);
		}
	}
}
