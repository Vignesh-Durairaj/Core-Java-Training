package cg.javaflp.practice;

public class ThreadStackPrac {
	
	int top;
	Object [] objArr;
	
	public ThreadStackPrac(int size) {
		objArr = new Object[size];
		top = -1;
	}
	
	private boolean isEmpty(){
		return top < 0;
	}
	
	private boolean isFull(){
		return top >= objArr.length;
	}
	
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
