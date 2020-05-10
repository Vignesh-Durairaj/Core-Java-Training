package tdi.javaFLP.languageBasic;

/**
 * This class is use to practice Array
 */
public class ArrayPractice {

	public static void main(String[] args) {
		
		// creates an int array of size 10
		int [] intArray = new int[10];
		
		// populate it with value of table of 2
		for (int i=1; i<11; i++){
			intArray[i-1] = i * 2;  
			// try to enter more than 10 values, and you will get an error
		}
		
		// print intArray  // you will see it will print an object ref.
		System.out.println(intArray);
		
		//to print value of intArray
		int j = 0;
		for (;;){
			j++;
			if (j == 10)   // change it as j == 11, and you will get an error
				break;
			
			System.out.println(intArray[j]);
		}
	}
}
