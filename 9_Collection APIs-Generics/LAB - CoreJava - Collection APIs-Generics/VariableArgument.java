package cg.javaflp.practice;

public class VariableArgument {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VariableArgument main = new VariableArgument();
		int z = main.sumOfNumber(14, 15, 16, 44);
		System.out.println(z);
	}
	
	
	private int sumOfNumber(int...x){
		int z = 0;
		for (int y : x){
			z = z + y;
		}
		return z;
	}


}
