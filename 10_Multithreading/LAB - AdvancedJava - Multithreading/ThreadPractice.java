package cg.javaflp.practice;

public class ThreadPractice implements Runnable{
	
	Thread thread;
	
	/* modified the constructor now it is taking name(String)
	 * and this name will be set for thread  
	 */
	public ThreadPractice(String name) {
		thread = new Thread(this, name);
		System.out.println(thread);
		thread.start();
	}
	
	@Override
	public void run() {
		tableOfTwo();
		// threadMethodPracice();
	}
	
	private void threadMethodPracice() {
		System.out.println(thread.getName());
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());
		System.out.println(thread.isAlive());
		System.out.println(thread.MAX_PRIORITY);
		System.out.println(thread.MIN_PRIORITY);
		System.out.println(thread.NORM_PRIORITY);
		
		System.out.println(thread.isDaemon());
	//	thread.setDaemon(true);
	//	System.out.println(thread.isDaemon());
		
		thread.setPriority(8);
		System.out.println(thread.getPriority());

		// thread.stop();
		System.out.println(thread.isAlive());
		System.out.println(thread);
	}

	public void tableOfTwo(){
		for (int i = 1; i <11; i++){
			try {
			//	thread.wait();
				thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(thread.getName() + i*2);
			// thread.notify();
		}
	}

}
