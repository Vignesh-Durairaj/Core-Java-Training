package cg.javaflp.practice;

/**
 * This class is use to practice various method and 
 * behavious of string class
 *
 */
public class StringPractice {

	public static void main(String[] args) {
			StringPractice practice = new StringPractice();
			practice.stringBerhavior();
	}
	
	
	private void stringBerhavior(){
		String s1 = "abc";
		String s2 = new String("abc");
		
		// check if s1 and s2 are same object (pointing to same ref)
		System.out.println(s1 == s2);
		
		// check if object value of s1 and s2 is same
		System.out.println(s1.equals(s2));
	}
	
	private void stringMethods(){
		
	}
	

}
