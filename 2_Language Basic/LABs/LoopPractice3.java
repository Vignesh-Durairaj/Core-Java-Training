package tdi.javaFLP.languageBasic;

/**
 * This class is use to practice FOR loop
 */
public class LoopPractice3 {
	
	/** Main Method (starting point)
	 * @param args
	 */
	public static void main(String[] args) {
		
		// since we have to print table of 3
		int x = 3;   // x can be change with run time argument 
		System.out.println("Table of : " + x);
		
		// this variable will be use to print table of 10, 20, 30 etc.
		int multipleOfThreecount = 0;
		
		for(int i = 1; i < 11; i++){
			if (i % 3 != 0){
				System.out.println(x + " * " + i + " : " + x * i);
			} else {
				// first time number will be 10, next time 20 and so on
				multipleOfThreecount++;
				int number = multipleOfThreecount * 10;
				
				for (int j = 1; j < 11; j ++){
					System.out.print(j * number + ", ");
				}
				System.out.println(" ");  // just to give a line break
			}
		}
	}
}
