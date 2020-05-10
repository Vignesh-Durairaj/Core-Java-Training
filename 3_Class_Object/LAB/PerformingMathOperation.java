package cg.javaflp.practice;

public class PerformingMathOperation {
	
	public static void main(String[] args) {
		
		MyMath myMath = new MyMath();
		
		/* First command line argument - to select type of operations
		 * 1 - add, 2 - substract, 3 - multiply, 4 - divide, 5 - modules  
		 */
		int oprType = Integer.parseInt(args[0]);
		
		// other two arguments are the numbers, on which operation will be performed
		double firstNo = Double.parseDouble(args[1]);
		double secNo = Double.parseDouble(args[2]);
		
		double result = 0.0;
		boolean isValidOpration = true;
		String operation = ""; 
		
		switch (oprType){
			case 1:
				result = myMath.add(firstNo, secNo);
				operation = "Addition ";
				break;
			case 2:
				result = myMath.substract(firstNo, secNo);
				operation = "Substration ";
				break;
			case 3:
				result = myMath.multiple(firstNo, secNo);
				operation = "Multiplication ";
				break;
			case 4:
				result = myMath.divide(firstNo, secNo);
				operation = "Division ";
				break;
			case 5:
				result = myMath.add(firstNo, secNo);
				break;
			default:
				operation = "Invalid Operation";
				isValidOpration = false;
				break;
		}		
		
		if (isValidOpration){
			System.out.println(operation + "of " 
				+ firstNo + " and "+ secNo + " : " + result);
		} else {
			System.out.println(operation);
		}
	}
}
