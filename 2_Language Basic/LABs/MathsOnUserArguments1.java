package tdi.javaFLP.languageBasic;

/**
 * This class is use to take three argument from user 
 * first as operation type and other two as number
 * 
 * Aim of this assignment is to learn how to use
 * if-else-if block
 */
public class MathsOnUserArguments1 {
	
	public static void main(String[] args) {
		
		/** Please ignore - what is String, args[, Integer and parseInt
		 * just use it for now, 
		 * we will learn about String in Java.LANG session,
		 * Integer and parseInt in WrapperClass session
		 * and args[] in session on ARRAY
		 * 
		 * For now just understand that, 
		 * String args[] is use to take command line arguments, 
		 * and parseInt to convert it into number
		 */
		// Receive three arguments; considering first as oprtation choice 
		String oprArg = args[0];
		String firstArg = args[1]; 
		String seconfArg = args[2];
		
		// parsing them
		int oprType = Integer.parseInt(oprArg);
		int firstNo = Integer.parseInt(firstArg);
		int secondNo = Integer.parseInt(seconfArg);
		
		// create two local variable
		int result = 0;
		boolean isWrongChoice = false;
		
		if (oprType == 1){
			result = firstNo + secondNo;
		}else if (oprType == 2){
			result = firstNo - secondNo;
		}else if (oprType == 3){
			result = firstNo * secondNo;
		}else if (oprType == 4){
			result = firstNo / secondNo;
		}else if (oprType == 5){
			result = firstNo % secondNo;
		}else {
			// in case first argument is beyond 1-5
			isWrongChoice = true;
		}
		
		if (!isWrongChoice){
			System.out.println("Result is : " + result);
		} else {
			System.out.println("Invalid choice!!! please enter 1-5 as choice.");
		}
	}
}
