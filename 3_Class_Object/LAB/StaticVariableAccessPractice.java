package cg.javaflp.practice;

public class StaticVariableAccessPractice {

	static int iStatic = 10;
	
	int iNonStatic = 15;
	
	public static void staticFirstMehtod(){
		
		System.out.println(iStatic);
		System.out.println(iNonStatic);
	}
	
	public void nonStaticSecondMehtod(){
		System.out.println(iStatic);
		System.out.println(iNonStatic);
	}
}
