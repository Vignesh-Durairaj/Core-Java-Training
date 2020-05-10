package tdi.javaFLP.languageBasic;

/**
 * This class is use to practice Array
 */
public class ArrayMultiDimensionalPractice {

	public static void main(String[] args) {
		
		// creates an int array of size 10
		int [][] intArray = new int[5][2];
		
		// populate it with value of table of 2
		int count = 0;
		
		for (int i=0; i<5; i++){
			for (int j = 0; j<2; j++){
				count++;
				intArray[i][j] = count * 2;
			}
		}
		
		for (int i=0; i<5; i++){
			for (int j = 0; j<2; j++){
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
