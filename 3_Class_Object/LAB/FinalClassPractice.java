package cg.javaflp.practice;

public class FinalClassPractice  {

	public static void main(String[] args) {
		ExampleFinalClass finalClass = new ExampleFinalClass();
		finalClass.display();
	}
}


class ExampleFinalClass{
	
	final void display(){
		System.out.println("in display ");
	}
}

class ExtendingFinalClass extends  ExampleFinalClass{
	/*
	@Override
	void display() {
		System.out.println("Overridden display method");
	}
	*/
}