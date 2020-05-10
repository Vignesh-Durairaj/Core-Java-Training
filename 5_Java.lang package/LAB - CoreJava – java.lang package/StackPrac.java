package cg.javaflp.practice;

/**
 * This class is basically creating a stack object
 * having push and pop behaviour and works on pricipal of LIFO
 * 
 * Instantiator of this object will define the size of stack
 */
public class StackPrac {

	int top;
	Object [] objArr;
	
	/**
	 * Constructor of stack; it creates an empty stack and set it size 
	 * @param size - to define size of stack
	 */
	public StackPrac(int size) {
		objArr = new Object[size];
		top = -1;
	}
	
	// to check if stack is empty 
	private boolean isEmpty(){
		return top < 0;
	}
	
	// to check if stack is full
	private boolean isFull(){
		return top >= objArr.length;
	}
	
	/**
	 * method to Push objects in stack
	 * it will not allow push, if stack is full
	 * @return boolean value for confirmation
	 */
	public boolean push(Object obj){
		if (isFull()){
			return false;
		}
		top ++;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		objArr[top] = obj;
		return true;
	}
	
	/**
	 * method to Pop objects from stack
	 * it will not allow pop, if stack is empty
	 * @return popped out Object, 
	 * in case of empty stack it will return null
	 */
	public Object pop(){
		if (isEmpty()){
			return null;
		}
		Object poppedObj = objArr[top];
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		top -- ;
		return poppedObj;
	}
}
