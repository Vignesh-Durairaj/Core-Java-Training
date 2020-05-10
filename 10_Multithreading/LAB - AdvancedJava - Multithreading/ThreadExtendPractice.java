package cg.javaflp.practice;

public class ThreadExtendPractice extends Thread {
	
	public ThreadExtendPractice(String name) {
		this.setName(name);
		this.start();
	}
	
	@Override
	public void run() {
		display();
	}
	
	public void display(){
		for (int i = 1; i <11; i++){
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + " " + i*2);
		}
	}
}
