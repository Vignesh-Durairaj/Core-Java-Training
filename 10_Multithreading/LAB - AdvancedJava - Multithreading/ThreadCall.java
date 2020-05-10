package cg.javaflp.practice;

public class ThreadCall {

	final StackPrac stackPrac = new StackPrac(50);
	
	public static void main(String[] args) {
		ThreadCall call = new ThreadCall();
		call.call();
	}

	public void call(){
		
		new Thread(){
			public void run(){
				for (int i = 0; i< 50; i ++){
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("Inside catch of PUSHED local class");
						e.printStackTrace();
					}
					boolean isPushed = stackPrac.push((Object)new Integer(i));
					System.out.println("For i = " + i + " is pushed " + isPushed);
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				for (int i = 0; i< 50; i ++){
					try {
						sleep(500);
					} catch (InterruptedException e) {
						System.out.println("Inside catch of POPPED local class");
						e.printStackTrace();
					}
					Object obj = stackPrac.pop();
					System.out.println("Object " + obj + " is pooped");
				}
			}
		}.start();
	}
	
}
