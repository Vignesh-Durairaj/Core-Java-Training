package cg.javaflp.practice;

/**
 * This class demonstrate the difference of 
 * Call By Value and Call by Ref
 */
public class CallByRefnValuePractice {
	
	int x = 10;

	public static void main(String[] args) {
		CallByRefnValuePractice object = new CallByRefnValuePractice();
		object.callByValueExample();
		object.callByRefExample();
	}
	
	/**
	 * This method calls a method of another class, which 
	 * multiply the passed(argument) value with 2
	 * Here we are passing a primitive data value
	 */
	private void callByValueExample(){
		PracticeClass pracClass = new PracticeClass();
		pracClass.multiplyBy2(x);
		System.out.println(x);
	}
	
	/**
	 * This method calls a method of another class, which 
	 * multiply the passed(argument) value with 2
	 * Here we are passing Object of current class
	 */
	private void callByRefExample(){
		CallByRefnValuePractice obj = new CallByRefnValuePractice();
		
		PracticeClass pracClass = new PracticeClass();
		pracClass.multiplyBy2(obj);
		System.out.println(obj.x);
	}
}


class PracticeClass{
	
	public int multiplyBy2(int a){
		a = a * 2;
		return a * 2;
	}
	
	public int multiplyBy2(CallByRefnValuePractice obj){
		obj.x = obj.x * 2;
		return obj.x * 2;
	}
}

