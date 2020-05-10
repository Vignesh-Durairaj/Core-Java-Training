package cg.javaflp.practice;

public class ThreadStack {

	public static void main(String[] args) {
		ThreadStack call = new ThreadStack();
		call.call();
	}

	// final StackPrac stackObj = new StackPrac(50);
	final ThreadStackPrac stackObj = new ThreadStackPrac(50);

	public void call(){
		
		new Thread(){
			public void run() {
				for(int i = 0; i<50; i++){
					try {
						sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					boolean isPushed = stackObj.push((Object)new Integer(i));
					if (isPushed)
						System.out.println("For i = " + i + " is pushed " + isPushed);
				}
			};
		}.start();
		
		new Thread(){
			public void run() {
				for(int i = 0; i<50; i++){
					Object obj = stackObj.pop();
					System.out.println(obj);
					try {
						sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();
	}

}
