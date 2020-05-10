package tdi.javaFLP.languageBasic;

/**
 * 
 * @author vivsinha
 * In this class main method will receive 
 *  run time (command line) argument and use it
 */
public class MyFirstWithArgument {
	
	/**
	 * Staring point of program, 
	 * command line (run time) argument will be passed to parameter args
	 * which is a String array
	 * @param args
	 */
	public static void main(String[] args) {
		
		// to receive command line (run time) argument
		String userName = args[0];
		
		/* Please do not bother about what is String, args[] and array 
		 * Will learn it in later stage.
		 * For now, this exercise just to understand that we can send some 
		 * data/info from command line at run time
		 */
		
		System.out.println("Hi " +  userName);
	}
}
