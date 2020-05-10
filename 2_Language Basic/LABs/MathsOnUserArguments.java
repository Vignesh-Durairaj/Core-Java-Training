package tdi.javaFLP.languageBasic;

/**
 * In this class, we will accept 
 * command line arguments and perform
 * mathematical operation on them
 */
public class MathsOnUserArguments {

	/** Main methods
	 * @param args
	 */
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
		
		
		String firstArg = args[0]; 
		String seconfArg = args[1];
		
		int firstNo = Integer.parseInt(firstArg);
		int secondNo = Integer.parseInt(seconfArg);
		
		// sum of the two numbers
		int result = firstNo + secondNo;
		System.out.println("Sum of "+firstNo+" and "+secondNo+" is: "+result);
	}

}
