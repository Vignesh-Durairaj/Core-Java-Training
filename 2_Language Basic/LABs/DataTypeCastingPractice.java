package tdi.javaFLP.languageBasic;

/**
 * This class is use to practice
 * various up and down casting
 */
public class DataTypeCastingPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a int variable
		int x = 1000;
		
		// try to assign it to a short variable (without casting)
		// short s = x;   // compiler will not allow it
		
		// now assign the same with casting
		short s = (short)x;
		
		System.out.println("int value is : " + x);
		System.out.println("short value (cast from int) : " + s);
		
		// now assign(cast) the same int value to a byte
		byte b = (byte)x;
		System.out.println("byte value (cast from int) : " + b);
		
		/** Learnings -  
		 * down casting must be explicitly cast
		 * value may lost in case of down casting
		 */
		
		// now assign (cast) the int into a long variable
		long l = x;   // no explicit cast is required
		
		/** Learnings -  
		 * up casting is implicit
		 */
		
		//TODO - do similar exercise for other data type 
		// (flaot, double, char, etc) as well
		
	}

}
